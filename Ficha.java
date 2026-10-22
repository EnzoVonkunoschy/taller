package com.example.taller;

import java.time.LocalDate;
import java.util.UUID;

public class Ficha {
    private String id;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;
    private Equipo equipo;
    private Persona persona;

    public Ficha( Equipo equipo, Persona persona ) {
        this.equipo = equipo;
        this.persona = persona;
    }
    public Ficha() {
        this.id = UUID.randomUUID().toString();
        this.fechaIngreso = LocalDate.now();
        this.fechaEgreso = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public boolean equals(Ficha ficha) {
        if (ficha == null) return false;
        return this.id.equals(ficha.getId());
    }

    @Override
    public String toString() {
        return "Ficha{id='" + id + "', fechaIngreso=" + fechaIngreso + '}';
    }
}
