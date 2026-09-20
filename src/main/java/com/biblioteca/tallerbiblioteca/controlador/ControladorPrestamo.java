package com.biblioteca.tallerbiblioteca.controlador;

import com.biblioteca.tallerbiblioteca.modelo.Biblioteca;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

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

        System.out.println("Código del libro: " + codigoLibro);
    }
}
