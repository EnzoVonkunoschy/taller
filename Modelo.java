package com.example.taller;
import java.io.File;
import java.util.ArrayList;

public class Modelo {
    private static Modelo instancia;

    private Modelo() {

    }

    public static Modelo getInstance() {
        if (instancia == null) {
            instancia = new Modelo();
        }
        return instancia;
    }
    @Override
    public String toString(){
        return "Única instancia de Modelo";
    }

    private String getRutaStorage() {
        String ruta = System.getProperty("user.dir");
        String storage = ruta + "\\src\\main\\java\\com\\example\\";
        File dir = new File(storage);
        if (dir.exists()) {
            return storage + "sectores.txt";
        }
        File superior = new File(ruta + "\\..\\sectores.txt");
        if (superior.exists()) {
            return superior.getAbsolutePath();
        }
        return ruta + "\\sectores.txt";
    }

    public void guardarSector(Sector sec) {
        String nombreArchivo = getRutaStorage();
        ArrayList<Sector> colSec = dameSectores();
        boolean existe = false;
        for (Sector s : colSec) {
            if (s.equals(sec)) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            colSec.add(sec);
        } else {
            System.out.println("El sector ya estaba agregado !");
        }
        LocalStorage.setItem(nombreArchivo, colSec);
    }

    public ArrayList<Sector> dameSectores() {
        String nombreArchivo = getRutaStorage();
        ArrayList<Sector> objectx = LocalStorage.getItem(nombreArchivo);
        if (objectx == null) {
            return new ArrayList<Sector>();
        }
        return objectx;
    }

    public void guardarSectores(ArrayList<Sector> colSec) {
        String nombreArchivo = getRutaStorage();
        LocalStorage.setItem(nombreArchivo, colSec);
    }
}