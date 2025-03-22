/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworkhr.logica;

/**
 *
 * @author Laura.Garcia
 */
public class Empleado {
    
   //definición de atributos
    private int id;
    private String nombre;
    private String cargo;
    private double salario;
    
    public Empleado (int id, String nombre, String cargo, double salario){
        
        this.id = id;
        this.nombre = nombre.trim();
        this.cargo = cargo;
        this.salario = salario;
        
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("Nombre no puede estar vacío");
        }
        if (salario < 0){
            throw new IllegalArgumentException("Salario debe ser un valor positivo y mayor que cero");
        }
    }
    
    public int getId(){
            return id;
        }
    
    public void setId(int id){
        if (id <= 0) throw new IllegalArgumentException ("ID no válido");
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        if (nombre == null || nombre.trim().isEmpty())
        throw new IllegalArgumentException ("Nombre no válido");
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        if (salario < 0) 
            throw new IllegalArgumentException("Salario no válido.");
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return String.format("Empleado{id=%d, nombre='%s', cargo='%s', salario=%.2f}",
                id, nombre, cargo, salario);
}
    
}
