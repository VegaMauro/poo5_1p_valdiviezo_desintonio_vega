package com.pooespol.Persona;

public class Editor {
    protected String journal;
    private String contrasena;
    protected Usuario rol;
    protected String user;

    public editor(String journal, String contrasena, String user, usuario rol) {
        this.journal = journal;
        this.contrasena = contrasena;
        this.rol = rol;
        this.user = user;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContraseña(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getJournal() {
        return journal;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setRol(usuario rol) {
        this.rol = rol;
    }

    public usuario getRol() {
        return rol;
    }
}
