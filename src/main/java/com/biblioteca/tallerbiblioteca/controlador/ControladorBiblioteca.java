package com.biblioteca.tallerbiblioteca.controlador;

import com.biblioteca.tallerbiblioteca.modelo.Biblioteca;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorBiblioteca {

    private Biblioteca biblioteca = new Biblioteca();

    @FXML
    private void registrarLibro() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/com/biblioteca/tallerbiblioteca/vista/VistaRegistrarLibro.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load(), 320, 400);

        ControladorRegistroLibro controladorRegistroLibro = fxmlLoader.getController();
        controladorRegistroLibro.setBiblioteca(biblioteca);

        Stage stage = new Stage();
        stage.setTitle("Registrar libro");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void realizarPrestamo(){

        System.out.println("RealizarPrestamo");
    }

    @FXML
    private void realizarDevolucion(){

        System.out.println("Realizar devolución");
    }
}
