//Exercício 3 — Leia dois números e diga qual é o maior.

package exerciciodaAula;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numero1 = sc.nextInt();

        if (numero > numero1){
            System.out.printf("%d maior que %d%n",numero, numero1);
        } else if (numero1 > numero) {
            System.out.printf("%d maior que %d%n",numero1, numero);
        }else {
            System.out.printf("%d e %d sao iguais!", numero1, numero);
        }

        sc.close();
    }
}