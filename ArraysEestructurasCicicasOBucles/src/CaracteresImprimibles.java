
import java.util.Scanner;
/*
FOR Programa que permita mostrar un listado, con todos los caracteres
imprimibles del teclado con su correspondiente ASCII al frente.
Ejm: A -> 65 B -> 66………………..Z -> 90; @ -> 64
Tenga presente que el código ASCII va desde 1 hasta 255; los primeros no son
imprimibles.
 */


public class CaracteresImprimibles {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        /*
        Solicita al usuario ingresar el codigo ASCCI inicial
         */
        System.out.println("Ingrese el codigo ASCII inicial: ");
        int inicio = teclado.nextInt();
        /*
        Solicita al usuario ingresar el codigo ASCCI final
         */
        System.out.println("Ingrese el codigo ASCII final: ");
        int fin = teclado.nextInt();

        /*
        Bucle for que itera desde ekl codigo inicial (inicio) hasta el codigo final (fin)
         */
        for (int i = inicio; i <= fin; i++){
            /*
            Convierte el valor de la variable i a un caracter y lo almancena en la variable caracter
             */
            char caracter = (char) i;
            /*
            Imprime el caracter y su codigo ASCII correspondiente en la consola
             */
            System.out.println(caracter + " -> " + i);
        }
    }
}
