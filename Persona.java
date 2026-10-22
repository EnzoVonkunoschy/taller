package com.example.taller;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String contacto;

    public Persona() { // Lo cree para poder tener un costructor vacio hasta poder llenarlo
    }

    public Persona(String nombre, String contacto) { // Lo cree para poder cumplir con el test
        this.nombre = nombre;
        this.contacto = contacto;
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
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", contacto='" + contacto + '\'' +
                '}';
    }

    public boolean equals(Persona persona) {
        if (persona == null) return false;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(contacto, persona.contacto);
    }
}
