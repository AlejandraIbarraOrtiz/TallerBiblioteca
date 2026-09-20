package com.biblioteca.tallerbiblioteca.controlador;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import com.biblioteca.tallerbiblioteca.modelo.Biblioteca;
import com.biblioteca.tallerbiblioteca.modelo.Libro;
import com.biblioteca.tallerbiblioteca.modelo.Prestamo;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class ControladorPrestamo {

    Alert alert = new Alert(AlertType.INFORMATION);

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
            alert.setTitle("Libro no encontrado");
            alert.setHeaderText(null);
            alert.setContentText("El libro: "+libro.getTitulo()+" no se encontro");
            alert.showAndWait();
        }

        Prestamo prestamo = new Prestamo(
                libro,
                LocalDate.now()
        );

        boolean realizado = biblioteca.prestarLibro(prestamo);

        if (realizado) {
            alert.setTitle("Preceso exitoso");
            alert.setHeaderText(null);
            alert.setContentText("El prestamo del libro: "+libro.getTitulo()+ " "+libro.getCodigo()+"\n"+" se realizó con exito");
            alert.showAndWait();
        } else {
            alert.setTitle("Libro no disponible");
            alert.setHeaderText(null);
            alert.setContentText("El libro: "+libro.getTitulo()+"\n"+"no esta disponible para prestamo");
            alert.showAndWait();
        }
    }
}
