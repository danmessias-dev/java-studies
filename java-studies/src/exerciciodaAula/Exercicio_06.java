//Exercício 6 — Leia um número e diga se ele é positivo, negativo ou zero.

package exerciciodaAula;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = sc.nextInt();

        if (numero > 0){
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        }else {
            System.out.println("Zero");
        }
        sc.close();
    }
}