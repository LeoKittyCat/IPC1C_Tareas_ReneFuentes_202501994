package tarea2ipc1;

//Imports. Importamos Scanner para que el usuario pueda escribir

import java.util.Scanner;

//Este es mi main, solo que tiene nombre de la tarea 
public class Tarea2IPC1 {

    static Scanner scanner = new Scanner(System.in); //Se usa static para que sea accesible incluso fuera de main
    
    public static void main(String[] args) {
        // Prueba para ver que si se guarden los cambios en github: System.out.println("Hola mundo");
        
        //Variables con diferentes tipos de datos
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
        
        System.out.println("Promedio inicial: " + promedioInicial);
        System.out.println("Opcion para continuar: " + opcionContinuar);
        System.out.println("Programa activo: " + programaActivo);
        
        int cantidadNumeros = leerEnteroValidado( /*Leemos cuantos datos va a ingresar el usuario*/
        "Cuantos numeros desea ingresar? (entre 1 y 10): ",
                1,
                10);
        int[] numeros = new int[cantidadNumeros]; /*Guardamos los datos*/
        
        llenarArreglo(numeros);
       mostrarResultadosArreglos(numeros);
    }
    
    public static int leerEnteroValidado(String mensaje, int minimo, int maximo) {
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
                 + minimo + " y " + maximo + "."); //Mostrar mensaje de error si el usuario ingresa un valor invalido
                
                
            } else {
                System.out.println("Error: debes de ingresar un numero entero");
                scanner.next(); //Desecha la respuesta incorrecta del usuario
            }
        }
    }
    
    public static void llenarArreglo(int[] numeros){
        
        System.out.println("\n--- INGRESO DE NUMEROS ---");
        
        for (int i = 0; i < numeros.length; i++){
            
            numeros[i] = leerEnteroValidado(
            "Ingrese el numero " + (i + 1) //Ponemos el +1 para que el mensaje sea "ingrese numero 1" en vez de "ingrese numero 0"
            + " entre 1 y 100: ",
                    1,
                    100);
        }
    }
    
    public static void mostrarResultadosArreglos(int[] numeros) {
        
        int maximo = numeros[0]; //Tomamos el primer numero del arreglo como punto de partida
        int minimo = numeros[0];
        int suma = 0; //Comienza desde 0
        
        for (int i = 0; i < numeros.length; i++) {
            
            suma = suma + numeros[i]; //Compararemos los numeros desde el inicio
            
            if (numeros[i] > maximo) { //Comparamos si el numero actual es mayor que el maximo numero ingresado
                maximo = numeros[i];
            }
            if (numeros[i] < minimo){ //Lo mismo que el mayor, pero para el menor XD
                minimo = numeros[i];
        }
    }
        double promedio = (double) suma / numeros.length; //Divide la suma entre la cantidad de numeros
        
        System.out.println("\n--- RESULTADOS DEL ARREGLO ---");
        System.out.println("Valor maximo: " + maximo);
        System.out.println("Valor minimo: " + minimo);
        System.out.println("Promedio: " + promedio);
    }
}
