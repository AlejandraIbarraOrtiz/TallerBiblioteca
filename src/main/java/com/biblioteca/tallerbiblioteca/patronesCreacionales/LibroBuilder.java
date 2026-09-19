package com.biblioteca.tallerbiblioteca.patronesCreacionales;
import com.biblioteca.tallerbiblioteca.modelo.Libro;

public class LibroBuilder {

    private final String codigo;
    private final String titulo;
    private final String autor;
    private final String categoria;
    private final String estado;

    private LibroBuilder(Builder builder){

        this.codigo = builder.codigo;
        this.titulo = builder.titulo;
        this.autor = builder.autor;
        this.categoria = builder.categoria;
        this.estado = builder.estado;

    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getEstado() {
        return estado;
    }

    public static class Builder{
        private String codigo;
        private String titulo;
        private String autor;
        private String categoria;
        private String estado;

        public Builder(String codigo, String titulo, String autor, String categoria, String estado){
            this.codigo = codigo;
            this.titulo = titulo;
            this.autor = autor;
        }

        public Builder categoria(String categoria){
            this.categoria = categoria;
            return this;
        }


        public Builder estado (String estado){
            this.estado = estado;
            return this;
        }

        public LibroBuilder buil(){
            return new LibroBuilder(this);
        }

    }
}
