package com.example.taller;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Ficha {
    private String id = UUID.randomUUID().toString(); // crea un UUID en formato String
    private Date fechaIngreso;
    private Date fechaEgreso;
    private Equipo equipo;
    private Persona persona;

    public Ficha() { // Lo cree para poder tener un costructor vacio hasta poder llenarlo
    }

    public Ficha(Equipo equipo, Persona persona) { // Lo cree para poder cumplir con el test
        this.equipo = equipo;
        this.persona = persona;
    }

    public String getId() {
        return id;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "id='" + id + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaEgreso=" + fechaEgreso +
                ", equipo=" + equipo +
                ", persona=" + persona +
                '}';
    }

    public boolean equals(Ficha ficha) {
        if (Ficha.this == ficha) return true;
        if (ficha == null) return false;
        return Objects.equals(fechaIngreso, ficha.fechaIngreso) && Objects.equals(fechaEgreso, ficha.fechaEgreso) && Objects.equals(equipo, ficha.equipo) && Objects.equals(persona, ficha.persona);
    }
}
