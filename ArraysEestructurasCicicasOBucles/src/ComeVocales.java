import java.util.Scanner;

/*
3. Realizar un programa llamado comevocales, que lea una cadena y la muestre sin
vocales, por ejemplo: lee MURCIELAGO y muestra MRCLG

 */
public class ComeVocales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Solicitar al usuario que ingrese el texto o cadena de caracteres
        System.out.print("Ingrese un texto: ");
        String cadena = teclado.nextLine();

        // Creamos una cadena vacia para almacenar la cadena sin vocales
        String cadenaSinVocales = "";

        //Recorrer la cadena de caracteres de la cadena o texto original
        for (int i = 0; i < cadena.length(); i++){
            //Obtener el caracter actual
            char caracter = cadena.charAt(i);

            //Verificar si el caracte no es una vocal (minuscula o mayuscula)
            if (!"aeiouAEIOU".contains(String.valueOf(caracter))){
                cadenaSinVocales += caracter;
            }
        }
        System.out.println("La cadena sin vocales es: " + cadenaSinVocales);
    }
}
