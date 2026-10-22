package com.example.taller;
import java.time.LocalDate;
import java.util.UUID;
import java.util.Objects;

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

    public Equipo() {
        this.id = UUID.randomUUID().toString();
        this.historial = "";
        this.enServicio = true;
        this.fechaBaja = null;
    }

    public Equipo(String tipo, String marca, String modelo,
                  String nroSerie) {
        this();
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.nroSerie = nroSerie;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNroSerie(String nroSerie) {
        this.nroSerie = nroSerie;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void addHistorial(String historial) {
        this.historial += historial;
    }

    public void setEnServicio(boolean enServicio) {
        this.enServicio = enServicio;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {return tipo;}

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public String getHistorial() {
        return historial;
    }

    public boolean isEnServicio() {
        return enServicio;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
    public Sector getSector() {
        return sector;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Equipo)) return false;

        Equipo otro = (Equipo) obj;
        return Objects.equals(nroSerie, otro.nroSerie);
    }

    @Override
    public String toString() {
        return "Equipo: " + tipo
                + ", Marca: " + marca
                + ", Modelo: " + modelo
                + ", Nro. de serie: " + nroSerie
                + ", En servicio: " + enServicio
                + ", Historial: " + historial;
        }
    }



