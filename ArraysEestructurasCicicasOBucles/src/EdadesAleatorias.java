import java.util.Random;
import java.util.Scanner;
/*
4. Leer aleatoriamente un número N de edades entre 18 y 100, guardarlas en un
Array; mostrar en un procedimiento, tanto las edades como el promedio de todas
las edades. Utilizar la función de biblioteca de aleatorios respectiva.
 */
public class EdadesAleatorias {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la cantidad de edades a generar: ");
        int n = teclado.nextInt();

        //Crea un arreglo para almacenar las edades
        int [] edades = new int[n];

        //Generar las edades aleatorias y almacenarlas en el arreglo
        for (int i = 0; i < n; i++){
            edades[i] = random.nextInt(83) + 18;
        }
        //Mostras las edades y calcular el promedio
        mostrarEdadesYPromedio(edades);
    }
    //Metodo para mostrar y calcular el promedio
    public static void mostrarEdadesYPromedio(int[] edades){
        int suma = 0;
        System.out.print("Edades: ");
        for (int edad : edades){
            System.out.println(edad);
            suma += edad;
        }


        double promedio = (double) suma / edades.length;
        System.out.println("El promedio de edades es: " + promedio);
    }
}
