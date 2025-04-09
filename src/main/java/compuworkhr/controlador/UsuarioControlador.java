/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworkhr.controlador;

import compuworkhr.logica.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laura.Garcia
 */
public class UsuarioControlador {
    private List<Usuario> usuarios = new ArrayList<>();
    
    public void agregarUsuario(Usuario usuario) {
        if (usuario == null) {
            throw new IllegalArgumentException("Usuario no puede ser null.");
        }
        // Validar que no exista otro usuario con el mismo id o username si es necesario
        usuarios.add(usuario);
    }

    public List<Usuario> getAllUsuarios() {
        return new ArrayList<>(usuarios);
    }
    
    public Usuario buscarPorId(int id) {
        return usuarios.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado."));
    }
    
    public Usuario buscarUsuarioPorNombre(String nombre) {
        for (Usuario user : usuarios) {
            if (user.getUsername().equalsIgnoreCase(nombre)) {
            return user;
            }
        }
        return null;
    }
}

