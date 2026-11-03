package com.example.taller;
import java.util.ArrayList;

public class Modelo {
    private static Modelo instancia;
    private final String archivoSectores = "sectores.txt";


    private Modelo() {

    }

    public static Modelo getInstance() {
        if (instancia == null) {
            instancia = new Modelo();
        }
        return instancia;
    }

    public void guardarSector(Sector sector) {
        ArrayList<Sector> listaSectores = dameSectores ();
        listaSectores.add(sector);
        LocalStorage.setItem(archivoSectores, listaSectores);

    }

    public ArrayList<Sector> dameSectores() {
        Object datos = LocalStorage.getItem(archivoSectores);
        if (datos instanceof ArrayList) {
            return (ArrayList<Sector>) datos;
        }
        return new ArrayList<>();
    }
    @Override
    public String toString(){
        return "Única instancia de Modelo";
    }
}