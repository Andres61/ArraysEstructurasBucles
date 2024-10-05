/*
6. Crear la función myFactorial(n) Hallar el Factorial de un número dado, mostrar la
serie y el resultado
Ejm: 4! Factorial de 4 es 24 porque 1 * 2 * 3 * 4 = 24
 */
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = teclado.nextInt();

        // Llamamos a la función myFactorial y mostramos el resultado
        int resultado = myFactorial(numero);
        System.out.println(" El factorial de " + numero + " es: " + resultado);
    }

    public static int myFactorial(int n) {
        // 1. Creamos un arreglo para almacenar la serie del factorial
        int[] serieFactorial = new int[n + 1];
        serieFactorial[0] = 1; // El factorial de 0 es 1

        // 2. Calculamos el factorial y almacenamos los valores en el arreglo
        for (int i = 1; i <= n; i++) {
            serieFactorial[i] = serieFactorial[i - 1] * i;
        }

        // 3. Imprimimos la serie del factorial
        System.out.print("Serie del factorial: 1");
        for (int i = 2; i <= n; i++) {
            System.out.print(" * " + i);
        }

        // 4. Retornamos el último valor del arreglo, que es el factorial de n
        return serieFactorial[n];
    }
}
