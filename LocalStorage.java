package com.example.taller;

import java.io.*;
import java.util.ArrayList;

public class LocalStorage {
    // 1. GUARDAR EN DISCO (Serialización)
    public static void setItem(String nombre, Object objeto) {
        try {
            // Abre o crea el archivo en la ruta indicada por 'nombre'
            FileOutputStream archivoSalida = new FileOutputStream(nombre);
            // Convierte el objeto Java (en este caso el ArrayList<Sector>) en bytes
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            objetoSalida.writeObject(objeto); // Escribe los bytes en el archivo
            objetoSalida.close();
            archivoSalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 2. LEER DEL DISCO (Deserialización)
    @SuppressWarnings("unchecked")
    public static <T> T getItem(String nomArchivo) {
        try {
            // Abre el archivo existente para leerlo
            FileInputStream archivoEntrada = new FileInputStream(nomArchivo);
            // Reconstruye el objeto Java a partir de los bytes guardados
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            T objetoDeserializado = (T) objetoEntrada.readObject();
            objetoEntrada.close();
            archivoEntrada.close();
            return objetoDeserializado; // Devuelve la lista recuperada
        } catch (IOException | ClassNotFoundException e) {
            // Si el archivo está vacío o no se puede leer, devuelve null
            System.out.println("Track del error: ");
            return null;
        }
    }
}
