package com.biblioteca.tallerbiblioteca.controlador;

import com.biblioteca.tallerbiblioteca.modelo.Biblioteca;
import com.biblioteca.tallerbiblioteca.modelo.Libro;
import com.biblioteca.tallerbiblioteca.modelo.Prestamo;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class ControladorPrestamo {

    private Biblioteca biblioteca;

    @FXML
    private TextField campoCodigoLibro;

    public void setBiblioteca(Biblioteca biblioteca){

        this.biblioteca = biblioteca;
    }

    @FXML
    private void realizarPrestamo(){

        String codigoLibro = campoCodigoLibro.getText();

        Libro libro = biblioteca.obtenerLibro(codigoLibro);

        if (libro == null) {
            System.out.println("No se encontró el libro");
            return;
        }

        Prestamo prestamo = new Prestamo(
                libro,
                LocalDate.now()
        );

        boolean realizado = biblioteca.prestarLibro(prestamo);

        if (realizado) {
            System.out.println("Préstamo realizado correctamente");
            System.out.println("Libro: " + libro.getTitulo());
            System.out.println("Estado: " + libro.getEstado());
        } else {
            System.out.println("No se pudo realizar el préstamo");
        }
    }
}
