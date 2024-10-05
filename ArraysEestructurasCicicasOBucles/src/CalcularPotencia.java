import java.util.Scanner;

/*
2. Suponiendo que NO existiera el método de biblioteca pow(base, exponente) crear
una función que haga las veces de dicho método, llamarla por ejemplo
myPotencias(base, exponente) . Ejm: myPotencias(2, 3) me retorna 2*2*2 = 8
 */
public class CalcularPotencia {

    /*
    *Calcular la potencia de un numero
    *
    * @param base:  la base la potencia
    * @param exponente: el exponente de la potencia
    * @retur el resultado de elevar la base al exponente
     */
    public static int myPotencia(int base, int exponente){
        //Caso base: cualquier numero elvado a 0 es 1
        if (exponente == 0){
            return 1;
        }
        //inicializar el resultado en 1
        int resultado = 1;

        //Multiplicar la base por si misma el numero de veces indicado
        for (int i = 0; i < exponente; i++){
            resultado *= base;
        }
        //Retorna el resultado final
        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa la base: ");
        int base = teclado.nextInt();
        System.out.println("Ingresa el exponente: ");
        int exponente = teclado.nextInt();

        int resultado = myPotencia(base,exponente);
        System.out.println(base + "elevado a " + exponente + "es: " + resultado);
    }
}
