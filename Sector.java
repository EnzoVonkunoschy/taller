package com.example.taller;

import java.util.UUID;

public class Sector {
    private String id;
    private String nombre;
    private String contacto;

    public Sector(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
    }
    public Sector() {
        this.id = UUID.randomUUID().toString();
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

    public boolean equals(Sector sector) {
        if (sector == null) return false;
        return this.id.equals(sector.getId());
    }

    @Override
    public String toString() {
        return "Sector{id='" + id + "', nombre='" + nombre + "'}";

    }

}
