package com.biblioteca.tallerbiblioteca.controlador;

import com.biblioteca.tallerbiblioteca.modelo.Biblioteca;
import com.biblioteca.tallerbiblioteca.modelo.Libro;
import com.biblioteca.tallerbiblioteca.patronesCreacionales.LibroBuilder;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class ControladorRegistroLibro {

    Alert alert = new Alert(AlertType.INFORMATION);

    private Biblioteca biblioteca;

    public void setBiblioteca(Biblioteca biblioteca){

        this.biblioteca = biblioteca;
    }

    @FXML
    private TextField campoCodigo;

    @FXML
    private TextField campoTitulo;

    @FXML
    private TextField campoAutor;

    @FXML
    private TextField campoCategoria;

    @FXML
    private TextField campoEstado;

    @FXML
    private void registrarLibro(){

        String codigo = campoCodigo.getText();
        String titulo = campoTitulo.getText();
        String autor = campoAutor.getText();
        String categoria = campoCategoria.getText();
        String estado = campoEstado.getText();

        Libro libro = new LibroBuilder.Builder(codigo, titulo, autor)
                .categoria(categoria)
                .estado(estado)
                .build();

        boolean registrado = biblioteca.registrarLibro(libro);

        if (registrado){
            alert.setTitle("Proceso exitoso");
            alert.setHeaderText(null);
            alert.setContentText("EL libro: "+libro.getTitulo()+" fue registrado exitosamente");
            alert.showAndWait();

        }else {
            alert.setTitle("Proceso exitoso");
            alert.setHeaderText(null);
            alert.setContentText("EL libro: "+libro.getTitulo()+" fue registrado exitosamente");
            alert.showAndWait();
        }
    }

}
