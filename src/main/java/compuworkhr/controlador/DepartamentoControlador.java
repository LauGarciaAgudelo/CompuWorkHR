/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworkhr.controlador;

import compuworkhr.logica.Departamento;
import compuworkhr.logica.Empleado;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Laura.Garcia
 */
public class DepartamentoControlador {

    private final List<Departamento> departamentos = new ArrayList<>();

    public void agregarDepartamento(Departamento departamento) {
        if (departamento == null) 
            throw new IllegalArgumentException("Departamento no puede ser null.");
        if (departamentos.stream().anyMatch(d -> d.getId() == departamento.getId())) 
            throw new IllegalArgumentException("ID de departamento duplicado.");
        departamentos.add(departamento);
    }

    public Departamento buscarPorId(int id) {
        return departamentos.stream()
            .filter(d -> d.getId() == id)
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Departamento no encontrado."));
    }

    public List<Departamento> getAllDepartamentos() {
        return new ArrayList<>(departamentos);
    }

    public List<Empleado> getEmpleadosPorDepartamento(int departamentoId) {
        return new ArrayList<>(buscarPorId(departamentoId).getEmpleados());
    }

    public void actualizarDepartamento(Departamento departamentoActualizado) {
        if (departamentoActualizado == null) 
            throw new IllegalArgumentException("Departamento inválido.");
        Departamento existente = buscarPorId(departamentoActualizado.getId());
        existente.setNombre(departamentoActualizado.getNombre());
    }

    public void eliminarDepartamento(int id) {
        Departamento existente = buscarPorId(id);
        departamentos.remove(existente);
    }

    public void asignarEmpleado(int departamentoId, Empleado empleado) {
        buscarPorId(departamentoId).agregarEmpleado(empleado);
    }

    public void removerEmpleado(int departamentoId, int empleadoId) {
        Departamento departamento = buscarPorId(departamentoId);
        Empleado emp = departamento.getEmpleados().stream()
                          .filter(e -> e.getId() == empleadoId)
                          .findFirst()
                          .orElseThrow(() -> new IllegalArgumentException("Empleado no encontrado en departamento."));
        departamento.eliminarEmpleado(emp);
    }

    public void transferirEmpleado(int empleadoId, int origenDeptId, int destinoDeptId) {
        Departamento origen = buscarPorId(origenDeptId);
        Departamento destino = buscarPorId(destinoDeptId);
        Empleado emp = origen.getEmpleados().stream()
                        .filter(e -> e.getId() == empleadoId)
                        .findFirst()
                        .orElseThrow(() -> new IllegalArgumentException("Empleado no existe en departamento origen."));
        origen.eliminarEmpleado(emp);
        destino.agregarEmpleado(emp);
    }
}
