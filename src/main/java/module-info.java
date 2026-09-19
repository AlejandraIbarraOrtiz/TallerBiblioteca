module com.biblioteca.tallerbiblioteca {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.biblioteca.tallerbiblioteca to javafx.fxml;
    exports com.biblioteca.tallerbiblioteca;
}