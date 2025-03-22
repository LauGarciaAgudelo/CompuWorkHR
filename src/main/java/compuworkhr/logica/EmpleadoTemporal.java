/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworkhr.logica;

import java.time.LocalDate;

/**
 *
 * @author Laura.Garcia
 */
public class EmpleadoTemporal extends Empleado {

    private LocalDate fechaFinContrato;

    public EmpleadoTemporal(int id, String nombre, String cargo, double salario, LocalDate fechaFinContrato) {
        super(id, nombre, cargo, salario);
        if (fechaFinContrato == null || fechaFinContrato.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Fecha de fin de contrato inválida.");
        }
        this.fechaFinContrato = fechaFinContrato;
    }

    public LocalDate getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(LocalDate fechaFinContrato) {
        if (fechaFinContrato == null || fechaFinContrato.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Fecha de fin de contrato inválida.");
        }
        this.fechaFinContrato = fechaFinContrato;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", fechaFinContrato=%s}", fechaFinContrato);
    }
}