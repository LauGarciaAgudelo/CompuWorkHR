/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworkhr.controlador;

import compuworkhr.logica.Empleado;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Laura.Garcia
 */
public class EmpleadoControlador {
    private final List<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException("Empleado no puede ser null.");
        }
        if (empleados.stream().anyMatch(e -> e.getId() == empleado.getId())) {
            throw new IllegalArgumentException("Ya existe un empleado con ese ID.");
        }
        empleados.add(empleado);
    }

    public Empleado buscarPorId(int id) {
        return empleados.stream()
            .filter(e -> e.getId() == id)
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Empleado no encontrado."));
    }

    public List<Empleado> getAllEmpleados() {
        return new ArrayList<>(empleados);
    }
    
    public void actualizarEmpleado(Empleado empleado) {
    if (empleado == null) throw new IllegalArgumentException("Empleado inválido.");
    Empleado existente = buscarPorId(empleado.getId());
    existente.setNombre(empleado.getNombre());
    existente.setCargo(empleado.getCargo());
    existente.setSalario(empleado.getSalario());
    }
    
    public void eliminarEmpleado(int id) {
        Empleado existente = buscarPorId(id);
        empleados.remove(existente);
    }
    
    public int generarId() {
        return empleados.stream().mapToInt(Empleado::getId).max().orElse(0) + 1;
    }
}
    
