package com.pooespol.Persona;

public class Editor {
    protected String journal;
    private String contrasena;
    //protected Usuario rol;
    protected String user;

    public editor(String journal, String contrasena, String user) {// falta Usuario rol
        this.journal = journal;
        this.contrasena = contrasena;
        //this.rol = rol;
        this.user = user;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String setContraseña(String contrasena) {
        this.contrasena = contrasena;
        return contrasena;
    }
}
