
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
    public List<Equipo> getEquipos() {
        return new ArrayList<>(equipos);
    }

    public void addEquipo(Equipo equipo) {
        if (equipo != null && !equipos.contains(equipo)) {
            equipos.add(equipo);
        }
    }
    public void delEquipo(String id) {
        equipos.removeIf(equipo -> equipo.getId().equals(id));
    }
    @Override
    public String toString() {
        return "Inventario: " + nombre
                + ", Cantidad de equipos: " + equipos.size();
    }
}

