package ipc1.tarea3;

public abstract class Vehiculo {

    private String placa;
    private String marca;
    private double tarifaBase;

    public Vehiculo(String placa, String marca, double tarifaBase) {
        this.placa = placa;
        this.marca = marca;
        this.tarifaBase = tarifaBase;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public abstract double calcularTarifa();
}

//hola