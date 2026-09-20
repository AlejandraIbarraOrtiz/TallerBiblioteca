package com.biblioteca.tallerbiblioteca.modelo;
import javafx.scene.Node;
import java.text.Normalizer;
import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> libros;
    ArrayList<Prestamo> prestamos;

    public Biblioteca(){
        this.libros = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public String normalizar(String texto){
        return Normalizer.normalize(texto,Normalizer.Form.NFD).
                replaceAll("\\p{M}","").
                trim().
                toLowerCase();
    }

    public boolean buscarLibro(String codigo){
        if (libros.isEmpty()) return false;

        for(Libro l: libros){
            if (normalizar(codigo).equals(normalizar(l.getCodigo()))){
                return true;
            }
        }
        return false;
    }

    public boolean registrarLibro(Libro libro){

        if(libro == null || buscarLibro(libro.getCodigo())) return false;

        libros.add(libro);
        return true;
    }

    public boolean prestarLibro(Prestamo prestamo){
        if(prestamo == null || !(buacarLibro(prestamo.getLibro().getCodigo()))) {
            return false;
        }
        prestamos.add(prestamo);
        prestamo.getLibro().setEstado("Prestado");
        return true;
    }
    public boolean devolverLibro(Libro libro){
        if(libro == null || !(buacarLibro(libro.getCodigo()))) return false;
        libro.setEstado("Disponible");
        return true;
    }

}
