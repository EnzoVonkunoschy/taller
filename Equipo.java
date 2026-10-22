package com.example.taller;

import java.time.LocalDate;
import java.util.UUID;

public class Equipo {
    private String id;
    private String tipo;
    private String marca;
    private String modelo;
    private String nroSerie;
    private String historial;
    private boolean enServicio;
    private LocalDate fechaBaja;
    private Sector sector;


    public Equipo(String tipo, String marca, String modelo, String nroSerie ) {
        this();
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.nroSerie = nroSerie;

    }

    public Equipo() {
        this.id = UUID.randomUUID().toString();
        this.historial = "";
        this.enServicio = true;
        this.fechaBaja = null;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(String nroSerie) {
        this.nroSerie = nroSerie;
    }

    public String getHistorial() {
        return historial;
    }


    public void addHistorial(String nuevoHistorial) {
        this.historial += nuevoHistorial;
    }

    public boolean isEnServicio() {
        return enServicio;
    }

    public void setEnServicio(boolean enServicio) {
        this.enServicio = enServicio;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public boolean equals(Equipo equipo) {
        if (equipo == null) return false;
        return this.id.equals(equipo.getId());
    }

    @Override
    public String toString() {
        return "Equipo{id='" + id + "', tipo='" + tipo + "', marca='" + marca + "'}";
    }
}
