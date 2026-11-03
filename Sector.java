
package com.example.taller;

import java.util.UUID;
import java.util.Objects;

public class Sector {

    private String id;
    private String nombre;
    private String contacto;

    public Sector() {
        this.id = UUID.randomUUID().toString();
    }
    public Sector(String nombre, String contacto) {

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

    public String getContacto() {return contacto;}

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "Sector: " + nombre + ", Contacto: " + contacto;
    }
    public boolean equals(Sector otro) {
        if (otro == null) {
            return false;
        }
        return Objects.equals(nombre, otro.nombre)
                && Objects.equals(contacto, otro.contacto);
    }
}

