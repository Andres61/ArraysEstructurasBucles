/*
7. Programa que permita mostrar la conocida serie de FIBONACCI, crear una función
que la invoque y la muestre, por ejemplo: myFibbonacci (n).
La siguiente es la serie FIBONACCI “0 - 1 – 1 – 2 – 3 – 5 – 8 – 13. – 21 …….”
• Hallar la sumatoria de los todos los números de la serie
• La serie finaliza cuando la sumatoria sobrepase el valor de 1000
 */
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario cuántos números de la serie quiere ver (opcional)
        System.out.print("¿Cuántos números de la serie de Fibonacci desea ver? (0 para calcular hasta superar 1000): ");
        int limite = teclado.nextInt();

        // Llamamos a la función myFibonacci para calcular y mostrar la serie
        myFibonacci(limite);
    }

    // Función para calcular y mostrar la serie de Fibonacci
    public static void myFibonacci(int limite) {
        int[] fibonacci = new int[limite];  // Arreglo para almacenar los números de Fibonacci
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        int sumatoria = 1;  // Inicializamos la sumatoria con 1

        System.out.print(fibonacci[0] + " - " + fibonacci[1]);

        for (int i = 2; i < fibonacci.length; i++) {
            // Calculamos el siguiente número de Fibonacci
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            sumatoria += fibonacci[i];

            // Imprimimos el número y lo concatenamos con un guión
            System.out.print(" - " + fibonacci[i]);

            // Si la sumatoria supera 1000, detenemos el ciclo
            if (sumatoria > 1000) {
                System.out.println("\nLa sumatoria ha superado 1000.");
                break;
            }
        }
    }
}