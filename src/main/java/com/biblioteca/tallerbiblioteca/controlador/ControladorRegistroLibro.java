package com.biblioteca.tallerbiblioteca.controlador;

import com.biblioteca.tallerbiblioteca.modelo.Biblioteca;
import com.biblioteca.tallerbiblioteca.modelo.Libro;
import com.biblioteca.tallerbiblioteca.patronesCreacionales.LibroBuilder;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControladorRegistroLibro {

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

            System.out.println("Libro registrado correctamente");
            System.out.println("Título: " + libro.getTitulo());
        }else {

            System.out.println("No se pudo registrar el libro");
        }
    }

}
