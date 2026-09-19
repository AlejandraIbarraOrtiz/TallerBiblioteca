package com.biblioteca.tallerbiblioteca.patronesCreacionales;

public class BibliotecaConfiguracion {
    private String nombre;
    private String direccion;
    private double multaPorTardanza;

    private static volatile BibliotecaConfiguracion instanccia;

    private BibliotecaConfiguracion(){
        this.nombre = "Biblioteca universitaria";
        this.direccion = "cr 15-12N";
        this.multaPorTardanza = 0.02; // 2% por día
    }
    public static BibliotecaConfiguracion getInstancia(){
        if(instanccia == null){
            synchronized (BibliotecaConfiguracion.class){
                instanccia = new BibliotecaConfiguracion();
            }
        }
        return instanccia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getMultaPorTardanza() {
        return multaPorTardanza;
    }

    public void setMultaPorTardanza(double multaPorTardanza) {
        this.multaPorTardanza = multaPorTardanza;
    }

    public static BibliotecaConfiguracion getInstanccia() {
        return instanccia;
    }

    public static void setInstanccia(BibliotecaConfiguracion instanccia) {
        BibliotecaConfiguracion.instanccia = instanccia;
    }
}
