package com.biblioteca.tallerbiblioteca.modelo;

import com.biblioteca.tallerbiblioteca.patronesCreacionales.LibroBuilder;
import com.biblioteca.tallerbiblioteca.patronesCreacionales.Prototype;

public class Libro implements Prototype {

    private String codigo;
    private String titulo;
    private String autor;
    private String categoria;
    private String estado;

    public Libro(LibroBuilder libroBuilder){

        this.codigo = libroBuilder.getCodigo();
        this.titulo = libroBuilder.getTitulo();
        this.autor = libroBuilder.getAutor();
        this.categoria = libroBuilder.getCategoria();
        this.estado = libroBuilder.getEstado();
    }

    public Libro(Libro libro){

        this.codigo =libro.codigo;
        this.titulo = libro.titulo;
        this.autor = libro.autor;
        this.categoria = libro.categoria;
        this.estado = libro.estado;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public Libro clone(){

        return new Libro(this);
    }
}

