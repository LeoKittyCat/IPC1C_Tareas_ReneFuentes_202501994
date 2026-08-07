package tarea2ipc1;

//Imports. Importamos Scanner para que el usuario pueda escribir

import java.util.Scanner;

//Este es mi main, solo que tiene nombre de la tarea 
public class Tarea2IPC1 {

    static Scanner scanner = new Scanner(System.in); //Se usa static para que sea accesible incluso fuera de main
    
    public static void main(String[] args) {
        
        //Variables con diferentes tipos de datos
        char opcionContinuar = 'S'; //Guarda una sola letra o caracter (siempre con comillas simples, o almenos creo '')
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
        
        System.out.println("Opcion para continuar: " + opcionContinuar); //Declaro la variable, pero no la voy a usar ya que solo es para demostrar el uso del tipo char
        System.out.println("Programa activo: " + programaActivo);
        
        int cantidadNumeros = leerEnteroValidado( /*Leemos cuantos datos va a ingresar el usuario*/
        "Cuantos numeros desea ingresar? (entre 1 y 10): ",
                1,
                10);
        int[] numeros = new int[cantidadNumeros]; /*Guardamos los datos*/
        
       llenarArreglo(numeros);
       mostrarResultadosArreglo(numeros);
       
       int[][]matriz = new int[3][3]; //Los dos pares de corchetes indican que son un arreglo de dos dimensiones, osea una matriz de 3x3
       llenarMatriz(matriz);
       mostrarMatrizYSuma(matriz);
    }
    
    public static int leerEnteroValidado(String mensaje, int minimo, int maximo) {
        
        while (true) {
            
            System.out.print(mensaje); //mostramos en pantalla el mensaje. No se usa ln al final ya que quiero que el usuario escriba en esa misma linea
            
            String entrada = scanner.nextLine(); //Vamos a leer todo lo que el usuario ingresa, ya que de lo contrario se buguea si hay un espacio entre dos numeros
            
            try {
                int numero = Integer.parseInt(entrada.trim()); //trim elimina espacios sobrantes al inicio y al final
                
                if(numero >= minimo && numero <= maximo) {
                    return numero;
                }
                
                System.out.println(
                "Error: el numero debe estar entre "
                + minimo + " y " + maximo + ".");
            } catch (NumberFormatException e) {
                
                System.out.println(
                "Error: debes de ingresar un numero entero.");
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
    
    public static void mostrarResultadosArreglo(int[] numeros) {
        
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
    
    public static void llenarMatriz(int[][] matriz) {
        
        System.out.println("\n--- INGRESO DE LA MATRIZ 3x3 ---");
        
        for (int fila = 0; fila < matriz.length; fila++) { //Este primer ciclo controla las filas
            
            for (int columna = 0; columna < matriz[fila].length; columna++) { //El segundo controla las columnas
                
                matriz[fila][columna] = leerEnteroValidado( //Pedimos un dato valido y lo guardamos en la posicion actual 
                "Ingrese el valor de la fila "
                + (fila +1)
                + ", columna "
                + (columna + 1)
                + " (entre 1 y 100): ",
                        1,
                        100);
            }
        }
    }
    
    public static void mostrarMatrizYSuma(int[][] matriz) {
        
        int suma = 0;
        
        System.out.println("\n--- MATRIZ INGRESADA ---");
        
        for (int fila = 0; fila  < matriz.length; fila++) {
            
            for (int columna = 0; 
                    columna  <  matriz[fila].length; 
                    columna++) {
                
                System.out.print(matriz[fila][columna] + "\t"); //Agrega una tabulacion para que la matriz tenga orden...pues de matriz XD
                
                suma = suma + matriz[fila][columna]; 
            } 
            
            System.out.println();
        } //Aqui creamos salto de linea para pasar a la siguiente fila
        
        System.out.println("Suma de todos los elementos: " + suma); //Mostramos la suma total de todos los nummeros que conforman la matriz
    
    }
}
