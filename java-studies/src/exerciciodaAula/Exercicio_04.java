//Exercício 4 — Leia a idade de uma pessoa e diga se ela pode votar (18 anos ou mais).

package exerciciodaAula;
import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Parabens voce agora pode votar");
        }else {
            System.out.println("Voce nao pode votar, ainda e menor de idade");
        }

        sc.close();
    }
}