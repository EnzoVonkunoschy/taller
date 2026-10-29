package com.example.taller;

public class Modelo {
    private static Modelo instancia;

    private Modelo() {

    }

    public static Modelo getInstance() {
        if (instancia == null) {
            instancia = new Modelo();
        }
        return instancia;
    }
    @Override
    public String toString(){
        return "Única instancia de Modelo";
    }
}