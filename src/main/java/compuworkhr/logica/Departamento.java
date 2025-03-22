/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworkhr.logica;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Laura.Garcia
 */
public class Departamento {
    
    private int id;
    private String nombre;
    private List<Empleado> empleados;
    
    //Definición del constructor
    public Departamento(int id, String nombre) {
        
        this.id = id;
        this.nombre = nombre.trim();
        this.empleados = new ArrayList<>();
        
        if (id <= 0) {
            throw new IllegalArgumentException("ID debe ser mayor que cero.");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre de departamento inválido.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("ID inválido.");
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) 
            throw new IllegalArgumentException("Nombre inválido.");
        this.nombre = nombre.trim();
    }
    
    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados); // Retorna copia para encapsulamiento
    }
    
    //Método para agregar el empleado a un departamento
    public void agregarEmpleado(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException("Empleado no puede ser null.");
        }
        if (empleados.contains(empleado)) {
            throw new IllegalArgumentException("Empleado ya asignado al departamento.");
        }
        empleados.add(empleado);
    }
    
    //Método para eliminar empleado de un departamento
    public void eliminarEmpleado(Empleado empleado) {
        if (!empleados.remove(empleado)) {
            throw new IllegalArgumentException("Empleado no encontrado en departamento.");
        }
    }
    
     @Override
    public String toString() {
        return String.format("Departamento{id=%d, nombre='%s', totalEmpleados=%d}", 
                             id, nombre, empleados.size());
    }
}
