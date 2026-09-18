package com.mycompany.tarea4;

public class MainConJoin {
    public static void main(String[] args) {
        LavadoThread hilo1 = new LavadoThread("P-123ABC", 300);
        LavadoThread hilo2 = new LavadoThread("P-456DEF", 450);
        Thread hilo3 = new Thread(
            new LavadoRunnable("M-789GHI", 200)
        );

        System.out.println(
            "hilo1 antes de start() -> " + hilo1.getState()
        );

        hilo1.start();
        hilo2.start();
        hilo3.start();

        System.out.println(
            "hilo1 despues de start() -> " + hilo1.getState()
        );

        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
        } catch (InterruptedException e) {
            System.out.println("Espera interrumpida");
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println("=== Lavado completo - 202501994 ===");

        System.out.println(
            "hilo1 al final de main -> " + hilo1.getState()
        );
    }
}