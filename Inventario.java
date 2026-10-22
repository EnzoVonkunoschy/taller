package com.example.taller;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private String nombre;
    private List<Equipo> equipos;

    public Inventario(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void addEquipo(Equipo equipo) {
        this.equipos.add(equipo);
    }

    public void delEquipo(String id) {
        equipos.removeIf(e -> e.getId().equals(id));
    }

    @Override
    public String toString() {
        return "Inventario{nombre='" + nombre + "', equipos=" + equipos + '}';
    }
}
