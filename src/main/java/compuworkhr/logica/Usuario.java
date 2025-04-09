/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworkhr.logica;

/**
 *
 * @author Laura.Garcia
 */
public class Usuario {
    public enum Rol {
        Administrador, Usuario
    }
    
    private int id;
    private String username;
    private String password;
    private Rol rol;
    
    public Usuario(int id, String username, String password, Rol rol) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }
    
    public int getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public Rol getRole() {
        return rol;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRole(Rol rol) {
        this.rol = rol;
    }
    
    @Override
    public String toString() {
        return String.format("Usuario{id=%d, username='%s', role=%s}", id, username, rol);
    }
}
