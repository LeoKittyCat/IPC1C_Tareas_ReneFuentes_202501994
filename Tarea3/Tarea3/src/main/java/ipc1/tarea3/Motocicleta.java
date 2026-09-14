package ipc1.tarea3;

public class Motocicleta extends Vehiculo {

    private int cilindrada;

    public Motocicleta(String placa, String marca, double tarifaBase, int cilindrada) {
        super(placa, marca, tarifaBase);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularTarifa() {
        if (cilindrada > 250) {
            return getTarifaBase() * 0.8;
        } else {
            return getTarifaBase() * 1.10;
        }
    }
}