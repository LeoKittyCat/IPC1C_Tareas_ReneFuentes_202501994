package com.mycompany.tarea4;

public class LavadoThread extends Thread {
    private String placa;
    private int duracion;

    public LavadoThread(String placa, int duracion) {
        this.placa = placa;
        this.duracion = duracion;
    }

    @Override
    public void run() {
        String[] pasos = {
            "Enjuague", "Jabon", "Cepillado", "Enjuague final", "Secado"
        };

        for (int i = 0; i < pasos.length; i++) {
            System.out.println(
                Thread.currentThread().getName()
                + " | " + placa
                + " | " + pasos[i]
            );

            try {
                Thread.sleep(duracion);
            } catch (InterruptedException e) {
                System.out.println("Lavado interrumpido");
            }
        }
    }
}