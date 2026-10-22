package com.example.taller;

import java.util.Objects;
import java.util.UUID;

public class Sector {
    private String id = UUID.randomUUID().toString(); // crea un UUID en formato String
    private String nombre;
    private String contacto;

    public Sector() { // Lo cree para poder tener un costructor vacio hasta poder llenarlo
    }2

    public Sector(String nombre, String contacto) { // Lo cree para poder cumplir con el test
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "Sector{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", contacto='" + contacto + '\'' +
                '}';
    }

    public boolean equals(Sector sector) {
        if (sector == null) return false;
        return Objects.equals(nombre, sector.nombre) && Objects.equals(contacto, sector.contacto);
    }
}
