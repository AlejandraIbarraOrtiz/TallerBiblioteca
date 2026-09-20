package com.biblioteca.tallerbiblioteca.controlador;

import com.biblioteca.tallerbiblioteca.modelo.Biblioteca;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ControladorDevolucion {

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

        boolean devuelto = biblioteca.devolverLibro(codigoLibro);

        if (devuelto) {

            alert.setTitle("Devolución exitosa");
            alert.setHeaderText(null);
            alert.setContentText("El libro fue devuelto correctamente");
            alert.showAndWait();

        }else {

            alert.setTitle("No se pudo realizar la devolución");
            alert.setHeaderText(null);
            alert.setContentText("No se encontró un préstamo activo para ese libro");
            alert.showAndWait();
        }
    }
}
