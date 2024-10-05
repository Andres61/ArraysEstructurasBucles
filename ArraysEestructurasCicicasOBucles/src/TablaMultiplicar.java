/*
8. Programa que permita escribir, la tabla de multiplicar de un número dado (N).
Ejm: la tabla del 9 mostrar:
9*1=9
9*2=18
9*10=90
 */

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Pedimos al usuario que ingrese el número para la tabla de multiplicar
        System.out.print("Ingrese el número para la tabla de multiplicar: ");
        int numero = teclado.nextInt();

        // 2. Llamamos a la función para imprimir la tabla de multiplicar
        imprimirTablaMultiplicar(numero);
    }

    // Función para imprimir la tabla de multiplicar de un número dado
    public static void imprimirTablaMultiplicar(int numero) {
        // 3. Creamos un arreglo para almacenar los resultados de las multiplicaciones
        int[] resultados = new int[10];

        // 4. Llenamos el arreglo con los resultados de las multiplicaciones
        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = numero * (i + 1);
        }

        // 5. Imprimimos la tabla de multiplicar
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 0; i < resultados.length; i++) {
            System.out.println(numero + " * " + (i + 1) + " = " + resultados[i]);
        }
    }
}