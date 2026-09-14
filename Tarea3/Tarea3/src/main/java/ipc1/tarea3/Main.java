package ipc1.tarea3;

public class Main {

    public static void main(String[] args) {

        Vehiculo[] flota = new Vehiculo[4];

        flota[0] = new Automovil("P-123ABC", "Toyota", 350.0, 5);
        flota[1] = new Automovil("P-456DEF", "Honda", 320.0, 4);
        flota[2] = new Motocicleta("M-789GHI", "Yamaha", 150.0, 300);
        flota[3] = new Motocicleta("M-012JKL", "Bajaj", 150.0, 200);

        double total = 0;

        System.out.println("== FLOTA DE VEHICULOS ==");
        System.out.println();

        for (int i = 0; i < flota.length; i++) {
            double tarifa = flota[i].calcularTarifa();

            System.out.println(
                    flota[i].getPlaca() + " "
                    + flota[i].getMarca() + " -> Q"
                    + tarifa
            );

            total = total + tarifa;
        }
        // Mensaje 
        System.out.println();
        System.out.println("TOTAL DE LA FLOTA: Q" + total);
    }
}