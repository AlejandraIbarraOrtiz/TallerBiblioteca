package com.biblioteca.tallerbiblioteca.patronesCreacionales;
import com.biblioteca.tallerbiblioteca.modelo.Libro;

public interface Prototype {

    Libro clone();
}
