package com.example.taller;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private String nombre;
    private List<Equipo> equipos = new ArrayList<>();

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void addEquipo(Equipo equipo) {
        this.equipos.add(equipo);
    }

    public void dellEquipo(String id) { // Recibe el id de un equipo y si su id conciden lo elimina
        this.equipos.removeIf(equipo -> equipo.getId().equals(id));
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "nombre='" + nombre + '\'' +
                ", equipos=" + equipos +
                '}';
    }
}
