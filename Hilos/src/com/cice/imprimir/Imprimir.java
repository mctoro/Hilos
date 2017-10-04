package com.cice.imprimir;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Imprimir extends Thread {

    private int dato;
    private String nombre;

    public Imprimir(String nombre, int dato) {

        this.dato = dato;
        this.nombre = nombre;

    }

    @Override
    public void run() {

        for (int i = 0; i < 3; i++);

        try {
            Thread.sleep(dato);
            System.out.println("Hilo " + nombre + " imprimo despues de " + (dato / 1000) + " segundos");
        } catch (InterruptedException ex) {
            Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
