/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworkhr.logica;

/**
 *
 * @author Laura.Garcia
 */

import java.time.LocalDate;

public class EvaluacionDesempeno {
   
    private LocalDate fecha;
    private Empleado empleado;
    private double resultadoEvaluacion;
    private String comentarios;
    
    public EvaluacionDesempeno(int id, Empleado empleado, double resultadoEvaluacion, String comentarios) {
        if (empleado == null) throw new IllegalArgumentException("Empleado no puede ser null.");
        if (resultadoEvaluacion < 1 || resultadoEvaluacion > 5) throw new IllegalArgumentException("El resultado de la evaluación debe estar entre 1 y 5.");

        this.fecha = LocalDate.now();
        this.empleado = empleado;
        this.resultadoEvaluacion = resultadoEvaluacion;
        this.comentarios = comentarios == null ? "" : comentarios.trim();
        
        if (empleado == null) throw new IllegalArgumentException("Empleado no puede ser null.");
        if (resultadoEvaluacion < 1 || resultadoEvaluacion > 5) 
            throw new IllegalArgumentException("Resultado de Evaluación debe estar entre 1 y 5.");
    }
    
    public LocalDate getFecha() {
        return fecha; 
    }
    public Empleado getEmpleado() {
        return empleado; 
    }
    public double getResultadoEvaluacion() {
        return resultadoEvaluacion; 
    }
    public String getComentarios() {
        return comentarios; 
    }

    @Override
    public String toString() {
        return String.format(
            "EvaluacionDesempeno{fecha=%s, empleado=%s, resultadoEvaluacion=%s, comentarios=%s}",
            fecha, empleado.getNombre(), resultadoEvaluacion, comentarios
        );
    }
    
}
