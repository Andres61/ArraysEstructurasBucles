/*
9. Almacenar en un array de N posiciones números aleatorios, al finalizar mostrar el
array sin recorrerlo con un bucle, sino con la clase Arrays.toString(myArray); que
se encuentra dentro de import java.util.Arrays
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumerosAleatoriosArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Pedimos al usuario que ingrese el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int N = teclado.nextInt();

        // 2. Creamos un arreglo de enteros de tamaño N
        int[] numeros = new int[N];

        // 3. Creamos un objeto Random para generar números aleatorios
        Random random = new Random();

        // 4. Llenamos el arreglo con números aleatorios entre 0 y 99
        for (int i = 0; i < N; i++) {
            numeros[i] = random.nextInt(100); // Genera números aleatorios entre 0 y 99
        }

        // 5. Imprimimos el arreglo completo utilizando Arrays.toString()
        System.out.println("El arreglo generado es: " + Arrays.toString(numeros));
    }
}
