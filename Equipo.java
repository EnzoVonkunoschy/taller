package com.example.taller;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Equipo {
    private String id = UUID.randomUUID().toString(); // crea un UUID en formato String
    private String tipo;
    private String marca;
    private String modelo;
    private String nroSerie;
    private String historial = "";
    private boolean enServicio = true;
    private Date fechaBaja = null;
    private Sector sector; // Relacion 1-1 entre equipo y sector, ademas de asignarle un sector al equipo

    public Equipo() { // Lo cree para poder tener un costructor vacio hasta poder llenarlo
    }

    public Equipo(String tipo, String marca, String modelo, String nroSerie) { // Lo cree para poder cumplir con el test
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.nroSerie = nroSerie;
    }

    public String getId() {
        return id;
    }

    public String getHistorial() {
        return historial;
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

    public boolean isEnServicio() {
        return enServicio;
    }

    public void setEnServicio(boolean enServicio) {
        this.enServicio = enServicio;
    }

    public void addHistorial (String string){
        this.historial += string; // concatena el string ingresado mediante addHistorial a historial
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(tipo, equipo.tipo) && Objects.equals(marca, equipo.marca) && Objects.equals(modelo, equipo.modelo) && Objects.equals(nroSerie, equipo.nroSerie);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nroSerie='" + nroSerie + '\'' +
                ", hisorial='" + historial + '\'' +
                ", enServicio=" + enServicio +
                ", fechaBaja=" + fechaBaja +
                '}';
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
}
