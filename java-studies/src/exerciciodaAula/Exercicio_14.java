package exerciciodaAula;

import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        if (idade < 16){
            System.out.println("Menor de 16, não vota!");
        }else {
            System.out.println("Maior que 16, pode vota!");
        }
    }
}
