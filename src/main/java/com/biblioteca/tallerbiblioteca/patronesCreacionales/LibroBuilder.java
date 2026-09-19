package com.biblioteca.tallerbiblioteca.patronesCreacionales;
import com.biblioteca.tallerbiblioteca.modelo.Libro;

public class LibroBuilder {

    private String codigo;
    private String titulo;
    private String autor;
    private String categoria;
    private String estado;

    public LibroBuilder(String codigo, String titulo, String autor){

        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;

    }

    public LibroBuilder setCategoria(String categoria){

        this.categoria = categoria;
        return this;
    }

    public LibroBuilder setEstado(String estado){

        this.estado = estado;
        return this;
    }

    public Libro build(){
        return new Libro(codigo, titulo, autor, categoria, estado);
    }
}
