package com.biblioteca.tallerbiblioteca.modelo;
import java.text.Normalizer;
import java.time.LocalDate;
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

    public Libro obtenerLibro(String codigo){

        for (Libro libro: libros){

            if (normalizar(codigo).equals((normalizar(libro.getCodigo())))){

                return libro;
            }
        }

        return null;
    }

    public boolean registrarLibro(Libro libro){

        if(libro == null || buscarLibro(libro.getCodigo())) return false;

        libros.add(libro);
        return true;
    }

    public boolean prestarLibro(Prestamo prestamo){

        if(prestamo == null){
            return false;
        }

        Libro libro = prestamo.getLibro();

        if(libro == null){
            return false;
        }

        if("Prestado".equalsIgnoreCase(libro.getEstado())){
            return false;
        }

        prestamos.add(prestamo);
        libro.setEstado("Prestado");

        return true;

    }

    public boolean devolverLibro(Libro libro){
        if(libro == null || !(buscarLibro(libro.getCodigo()))) return false;
        libro.setEstado("Disponible");
        return true;

    }

    public boolean devolverLibro(String codigo){

        for (Prestamo prestamo : prestamos){

            if (!prestamo.isDevuelto() && normalizar(codigo).equals(normalizar(prestamo.getLibro().getCodigo()))){

                prestamo.devolverLibro(LocalDate.now());

                return true;
            }
        }

        return false;
    }

}
