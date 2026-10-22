package com.example.taller;

public class Persona {
    private String nombre;
    private String contacto;

    public Persona(String nombre, String contacto) {
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

    public boolean equals(Persona persona) {
        if (persona == null) return false;
        return this.nombre.equals(persona.getNombre()) && this.contacto.equals(persona.getContacto());
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', contacto='" + contacto + "'}";
    }
}
