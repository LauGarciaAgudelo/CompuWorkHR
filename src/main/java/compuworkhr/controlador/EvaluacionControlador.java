/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworkhr.controlador;

import compuworkhr.logica.Departamento;
import compuworkhr.logica.EvaluacionDesempeno;
import compuworkhr.logica.ReporteDesempeno;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Laura.Garcia
 */
public class EvaluacionControlador {

    private final List<EvaluacionDesempeno> evaluaciones = new ArrayList<>();
    private int nextReportId = 1;

    public void agregarEvaluacion(EvaluacionDesempeno eval) {
        if (eval == null) {
            throw new IllegalArgumentException("Evaluación no puede ser null.");
        }
        evaluaciones.add(eval);
    }

    public List<EvaluacionDesempeno> getEvaluaciones() {
        return new ArrayList<>(evaluaciones);
    }

    public ReporteDesempeno generarReporteIndividual(int empleadoId) {
        List<EvaluacionDesempeno> evs = evaluaciones.stream()
            .filter(e -> e.getEmpleado().getId() == empleadoId)
            .collect(Collectors.toList());

        if (evs.isEmpty()) {
            throw new IllegalArgumentException("No hay evaluaciones para el empleado ID=" + empleadoId);
        }

        double avg = evs.stream().mapToDouble(EvaluacionDesempeno::getResultadoEvaluacion).average().orElse(0.0);
        return new ReporteDesempeno(
            nextReportId++,
            evs.get(0).getEmpleado(),
            (int)Math.round(avg),
            "Reporte individual: promedio = " + String.format("%.2f", avg)
        );
    }

    public ReporteDesempeno generarReporteDepartamento(int departamentoId, DepartamentoControlador departamentoCtrl) {
        Departamento departamento = departamentoCtrl.buscarPorId(departamentoId);
        List<EvaluacionDesempeno> evs = evaluaciones.stream()
            .filter(e -> departamento.getEmpleados().contains(e.getEmpleado()))
            .collect(Collectors.toList());

        if (evs.isEmpty()) {
            throw new IllegalArgumentException("No hay evaluaciones en departamento ID=" + departamentoId);
        }

        double avg = evs.stream().mapToDouble(EvaluacionDesempeno::getResultadoEvaluacion).average().orElse(0.0);
        return new ReporteDesempeno(
            nextReportId++,
            departamento.getNombre(),
            (int)Math.round(avg),
            "Reporte departamento " + departamento.getNombre() + ": promedio = " + String.format("%.2f", avg)
        );
    }
}