package com.example.taller;

public class Controlador {
    private static Controlador instancia;

    private Controlador() {

    }

    public static Controlador getInstance() {
        if (instancia == null) {
            instancia = new Controlador();
        }
        return instancia;
    }

    @Override
    public String toString() {
        return "Única instancia de Controlador";
    }
}
