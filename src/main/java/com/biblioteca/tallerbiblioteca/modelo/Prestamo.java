package com.biblioteca.tallerbiblioteca.modelo;

import java.time.LocalDate;

public class Prestamo {

    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private boolean devuelto;

    public Prestamo(Libro libro, LocalDate fechaPrestamo){

        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.devuelto = false;
    }

    public void devolverLibro(LocalDate fechaDevolucion){

        this.fechaDevolucion = fechaDevolucion;
        this.devuelto = true;
        this.libro.setEstado("Disponible");
    }

    public Libro getLibro(){

        return libro;
    }

    public LocalDate getFechaPrestamo(){

        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion(){

        return fechaDevolucion;
    }

    public boolean isDevuelto(){

        return devuelto;
    }

}
