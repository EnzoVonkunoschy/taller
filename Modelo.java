package com.example.taller;
import java.util.ArrayList;

public class Modelo {
    private static Modelo instancia;
    //String ruta = System.getProperty("user.dir");
    //String storage = ruta+"\\src\\main\\java\\com\\example\\";
    //String storageOficinas = storage + "oficinas.txt";
    private final String archivoSectores = System.getProperty("user.dir")+"\\src\\main\\java\\com\\example\\"+"sectores.txt";


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