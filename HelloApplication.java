package com.example.taller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    boolean produccion = false;
    //boolean produccion = true;

    @Override
    public void start(Stage stage) throws IOException {
        if (produccion) {


        stage.setTitle("Hello!");

        stage.show();
        }else{
            test00();
        }
    }

    private void  test00(){
        System.out.println("Corriendo tests Sector");

        Sector sector = new Sector();
        sector.setNombre("Educación");
        sector.setContacto("261-2-123123");
        System.out.println(sector.getId());
        System.out.println(sector.getNombre());
        System.out.println(sector.getContacto());
        Sector sector2 = new Sector("Educación","261-2-123123");
        System.out.println(sector.equals(sector2));
        sector2.setNombre("Depósito");
        sector2.setContacto("261-1-112233");
        System.out.println(sector.equals(sector2));
        System.out.println(sector.toString());
        System.out.println(sector2.toString());

        System.out.println("Corriendo tests Equipo");

        Equipo equipo = new Equipo();
        equipo.setTipo("Impresora");
        equipo.setMarca("Epson");
        equipo.setModelo("LX810");
        equipo.setNroSerie("Abc_123");
        equipo.setSector(sector);
        equipo.addHistorial("Primer registro de Historial\n"+equipo.getTipo()+" - "+equipo.getMarca()+" - "+equipo.getModelo());

        System.out.println(equipo.getId());
        System.out.println(equipo.getTipo());
        System.out.println(equipo.getMarca());
        System.out.println(equipo.getModelo());
        System.out.println(equipo.getNroSerie());
        System.out.println(equipo.getSector());
        System.out.println(equipo.getHistorial());
        System.out.println(equipo.isEnServicio());

        Equipo equipo2 = new Equipo("Impresora","Epson","LX810","Abc_123");
        System.out.println(equipo.equals(equipo2));
        equipo2.setNroSerie("Abc_124");
        System.out.println(equipo.equals(equipo2));

        System.out.println(equipo.toString());
        System.out.println(equipo2.toString());

        System.out.println("Corriendo test Persona");
        Persona persona = new Persona("Laura","261-1-123123");
        Persona persona2 = new Persona("Laura","261-1-123123");

        System.out.println(persona.getNombre().equals(persona2.getNombre()));
        System.out.println(persona.getContacto().equals(persona2.getContacto()));
        System.out.println(persona.equals(persona2));

        persona2.setNombre("Pablo");
        persona2.setContacto("261-1-123124");

        System.out.println(persona.getNombre().equals(persona2.getNombre()));
        System.out.println(persona.getContacto().equals(persona2.getContacto()));
        System.out.println(persona.equals(persona2));
        System.out.println(persona2.toString());

        System.out.println("Corriendo test Ficha");
        Ficha ficha01 = new Ficha(equipo,persona);
        System.out.println(ficha01.getId());
        System.out.println(ficha01.getFechaIngreso());
        System.out.println(ficha01.toString());



    };
}
