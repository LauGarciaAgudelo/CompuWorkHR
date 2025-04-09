/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworkhr.logica;

import java.time.LocalDate;

/**
 * @author Laura.Garcia
 */

public class ReporteDesempeno {

    private int id;
    private LocalDate fecha;
    private Empleado empleado;
    private String departamento;
    private double resultadoEvaluacion;
    private String comentarios;

    public ReporteDesempeno(int id, Empleado empleado, double resultadoEvaluacion, String comentarios) {
        if (id <= 0) throw new IllegalArgumentException("ID inválido.");
        if (empleado == null) throw new IllegalArgumentException("Empleado no puede ser null.");
        if (resultadoEvaluacion < 1 || resultadoEvaluacion > 5)
            throw new IllegalArgumentException("Calificación debe estar entre 1 y 5.");

        this.id = id;
        this.fecha = LocalDate.now();
        this.empleado = empleado;
        this.departamento = null;
        this.resultadoEvaluacion = resultadoEvaluacion;
        this.comentarios = comentarios == null ? "" : comentarios.trim();
    }

    public ReporteDesempeno(int id, String departamento, int resultadoEvaluacion, String comentarios) {
        if (id <= 0) throw new IllegalArgumentException("ID inválido.");
        if (departamento == null || departamento.trim().isEmpty())
            throw new IllegalArgumentException("Nombre de departamento inválido.");
        if (resultadoEvaluacion < 1 || resultadoEvaluacion > 5)
            throw new IllegalArgumentException("El resultado de la evaluación debe estar entre 1 y 5.");

        this.id = id;
        this.fecha = LocalDate.now();
        this.empleado = null;
        this.departamento = departamento.trim();
        this.resultadoEvaluacion = resultadoEvaluacion;
        this.comentarios = comentarios == null ? "" : comentarios.trim();
    }

    public int getId() {
        return id; 
    }
    public LocalDate getFecha() {
        return fecha; 
    }
    public Empleado getEmpleado() {
        return empleado; 
    }
    public String getDepartamento() {
        return departamento; 
    }
    public double getResultadoEvaluacion() {
        return resultadoEvaluacion; 
    }
    public String getComentarios() {
        return comentarios; 
    }

    @Override
    public String toString() {
        if (empleado != null) {
            return String.format(
                "ReporteDesempeno{id=%d, fecha=%s, empleado='%s', resultadoEvaluacion=%s, comentarios='%s'}",
                id, fecha, empleado.getNombre(), resultadoEvaluacion, comentarios
            );
        } else {
            return String.format(
                "ReporteDesempeno{id=%d, fecha=%s, departamento='%s', resultadoEvaluacion=%s, comentarios='%s'}",
                id, fecha, departamento, resultadoEvaluacion, comentarios
            );
        }
    }
}
