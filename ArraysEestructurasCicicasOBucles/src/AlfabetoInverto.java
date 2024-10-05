import java.util.Scanner;
/*
5. WHILE, Programa que permita escribir el alfabeto en minúscula o mayúsculas
según el usuario lo desee (como lo quiere, en mayúsculas, de forma Ascendente,
de forma descendente? ): ejm: a – b- c- d ……..z. o Z–Y – X – ……………..D – C – B -
A.
 */
public class AlfabetoInverto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Creamos dos arreglos de caracteres, uno para el alfabeto en mayúscula y otro en minúscula.
        //    toCharArray() convierte un String en un arreglo de caracteres.
        char[] alfabetoMayuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] alfabetoMinuscula = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        // 2. Pedimos al usuario que seleccione si quiere ver el alfabeto en mayúscula o minúscula.
        //    Convertimos la respuesta a mayúsculas y tomamos el primer caracter.
        System.out.print("¿Desea ver el alfabeto en mayúscula o minúscula? (M/m): ");
        char opcion = teclado.next().toUpperCase().charAt(0);

        // 3. Pedimos al usuario que seleccione si quiere ver el alfabeto en orden ascendente o descendente.
        //    Convertimos la respuesta a mayúsculas y tomamos el primer caracter.
        System.out.print("¿Desea ver el alfabeto en orden ascendente o descendente? (A/D): ");
        char orden = teclado.next().toUpperCase().charAt(0);

        // 4. Seleccionamos el arreglo de caracteres a utilizar según la opción del usuario.
        //    Es un operador ternario que equivale a un if-else más corto.
        char[] alfabetoElegido = (opcion == 'M') ? alfabetoMayuscula : alfabetoMinuscula; // Puedes agregar el arreglo para minúsculas aquí

        // 5. Inicializamos un índice para recorrer el arreglo.
        //    Si el orden es descendente, empezamos por el final del arreglo.
        int indice = 0;
        if (orden == 'D') {
            indice = alfabetoElegido.length - 1;
        }

        // 6. Ciclo while que se ejecuta mientras el índice esté dentro de los límites del arreglo.
        while (indice >= 0 && indice < alfabetoElegido.length) {
            // 7. Imprimimos el caracter en la posición del índice.
            System.out.print(alfabetoElegido[indice] + " ");

            // 8. Incrementamos o decrementamos el índice según el orden seleccionado.
            if (orden == 'A') {
                indice++;
            } else {
                indice--;
            }
        }
    }
}