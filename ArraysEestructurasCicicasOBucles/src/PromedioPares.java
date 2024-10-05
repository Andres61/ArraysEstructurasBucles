/*
10. De su autoría plantee y resuelva 1 problema que contengan un ciclo
 */
import java.util.Scanner;

public class PromedioPares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Pedimos al usuario que ingrese la cantidad de números
        System.out.print("Ingrese la cantidad de números: ");
        int cantidadNumeros = teclado.nextInt();

        // 2. Creamos un arreglo para almacenar los números ingresados
        int[] numeros = new int[cantidadNumeros];

        // 3. Llenamos el arreglo con los números ingresados por el usuario
        System.out.println("Ingrese los números:");
        for (int i = 0; i < cantidadNumeros; i++) {
            numeros[i] = teclado.nextInt();
        }

        // 4. Llamamos a la función calcularPromedioPares para obtener el promedio de los números pares
        double promedioPares = calcularPromedioPares(numeros);

        // 5. Imprimimos el resultado
        System.out.println("El promedio de los números pares es: " + promedioPares);
    }

    // Función para calcular el promedio de los números pares en un arreglo
    public static double calcularPromedioPares(int[] numeros) {
        int sumaPares = 0;
        int contadorPares = 0;

        // Recorremos el arreglo para buscar los números pares
        for (int numero : numeros) {
            if (numero % 2 == 0) { // Si el número es par
                sumaPares += numero;
                contadorPares++;
            }
        }

        // Calculamos el promedio si hay al menos un número par
        if (contadorPares > 0) {
            return (double) sumaPares / contadorPares;
        } else {
            return 0; // No hay números pares
        }
    }
}
