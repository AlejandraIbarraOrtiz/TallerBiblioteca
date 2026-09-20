package com.biblioteca.tallerbiblioteca.modelo;

public class Usuario {
    private String nombre;
    private String correo;
    private int telefono;
    private int id;

    public Usuario(String nombre, String correo, int telefono, int id) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono=" + telefono +
                ", id=" + id +
                '}';
    }
}
