package com.pooespol.Persona;
public class Revisor extends Persona {
    private String especialidad;
    private String user;
    private String contraseña;
    private usuario rol;
    private int articulosRevisados;

    public Revisor(String nombre, String apellido, String correo, String especialidad, String user, String contraseña,
            usuario rol, int articulosRevisados) {
        super(nombre, apellido, correo);
        this.user = user;
        this.especialidad = especialidad;
        this.contraseña = contraseña;
        this.rol = rol;
        this.articulosRevisados = articulosRevisados;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public usuario getRol() {
        return rol;
    }

    public void setRol(usuario rol) {
        this.rol = rol;
    }

    public int getArticulosRevisados() {
        return articulosRevisados;
    }

    public void setArticulosRevisados(int articulosRevisados) {
        this.articulosRevisados = articulosRevisados;
    }

    
}
