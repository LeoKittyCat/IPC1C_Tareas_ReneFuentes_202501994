package tarea2ipc1;

//Imports. Importamos Scanner para que el usuario pueda escribir

import java.util.Scanner;

//Este es mi main, solo que tiene nombre de la tarea 
public class Tarea2IPC1 {

    static Scanner scanner = new Scanner(System.in); //Se usa static para que sea accesible incluso fuera de main
    
    public static void main(String[] args) {
        // Prueba para ver que si se guarden los cambios en github: System.out.println("Hola mundo");
        
        //Variables con diferentes tipos de datos
        int cantidadNumeros = 5; //Guarda numeros enteros(sin decimales)
        double promedioInicial = 0.0; //Guarda numeros con punto decimal
        char opcionContinuar = 'S'; //Guarda una sola letrd o caracter (siempre con comillas simples, o almenos creo '')
        boolean programaActivo = true; //Guarda un valor logico: verdadero o falso
        String nombrePrograma = "Analizador de numeros y matrices"; //Guarda texto completo
        
        /*
        * Este programa solicita numeros al usuario
        * Validamos los datos ingresados
        * Utilizamos los arreglos que nos pide el proyecto
        */
        
        System.out.println("================================="); //Esto es solo para imprimir el titulo de una forma fancy jeje
        System.out.println(nombrePrograma);
        System.out.println("=================================");
        
        System.out.println("Cantidad de numeros: " + cantidadNumeros);
        System.out.println("Promedio inicial: " + promedioInicial);
        System.out.println("Opcion para continuar: " + opcionContinuar);
        System.out.println("Programa activo: " + programaActivo);
    }
    
    public static int leerEneteroValidado(String mensaje, int minimo, int maximo) {
        int numero; //Con esta variable puedo guardar el numero que ingrese el usuario, el cual debe de ser entero
        
        while (true) {
            
            System.out.print(mensaje); //mostramos en pantalla el mensaje. No se usa ln al final ya que quiero que el usuario escriba en esa misma linea
            
            if (scanner.hasNextInt()) /*verificamos que el dato ingresado sea entero*/{
                
                numero = scanner.nextInt(); //si es entero, entonces toma ese dato entero y lo guarda como numero
                
                if  (numero >= minimo && numero <= maximo) {
                    return numero; //El numero ingresado si se registra si es mayor que 1 y menor que 100
                }
                
                 System.out.println(
                 "Error: el numero debe estar entre "
                 + minimo + "y" + maximo + "."); //Mostrar mensaje de error si el usuario ingresa un valor invalido
                
                
            } else {
                System.out.println("Error: debes de ingresar un numero entero");
                scanner.next(); //Desecha la respuesta incorrecta del usuario
            }
        }
    }
    
}
