package com.biblioteca.tallerbiblioteca.controlador;

import com.biblioteca.tallerbiblioteca.modelo.Biblioteca;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ControladorDevolución {

    Alert alert = new Alert(AlertType.INFORMATION);

    private Biblioteca biblioteca;

    @FXML
    private TextField campoCodigoLibro;

    public void setBiblioteca(Biblioteca biblioteca){

        this.biblioteca = biblioteca;
    }

    @FXML
    private void realizarDevolucion(){

        String codigoLibro = campoCodigoLibro.getText();

        alert.setTitle("realizar devolución");
        alert.setHeaderText(null);
        alert.setContentText("El codigo del libro es"+ codigoLibro );
        alert.showAndWait();
    }
}
