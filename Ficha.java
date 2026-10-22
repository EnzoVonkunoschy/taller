
package com.example.taller;

import java.util.UUID;
import java.time.LocalDate;

public class Ficha {

    private String id;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;
    private Equipo equipo;
    private Persona persona;

    public Ficha(Equipo equipo, Persona persona) {
        this.id = UUID.randomUUID().toString();
        this.fechaIngreso = LocalDate.now();
        this.fechaEgreso = LocalDate.now();
        this.equipo = equipo;
        this.persona = persona;
    }

    public String getId() {return id;}
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public LocalDate getFechaEgreso() {return fechaEgreso;}
    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }
    public Equipo getEquipo() {
        return equipo;
    }
    public Persona getPersona() {
        return persona;
    }

    @Override
    public String toString() {
        return "Ficha: " + id
                + ", Fecha de ingreso: " + fechaIngreso
                + ", Fecha de egreso: " + fechaEgreso;
    }

    public boolean equals(Ficha otra) {
        if (otra == null) {
            return false;
        }

        return id.equals(otra.id);
    }
}
