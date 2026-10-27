
package com.example.taller;

import java.util.Objects;

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
    @Override
    public String toString() {
        return "Persona: " + nombre + ", Contacto: " + contacto;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Persona)) {
            return false;
        }
        Persona otra = (Persona) obj;

        return Objects.equals(nombre, otra.nombre)
                && Objects.equals(contacto, otra.contacto);
    }
}
