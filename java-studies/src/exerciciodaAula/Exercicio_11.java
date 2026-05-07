package exerciciodaAula;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = in.nextInt();

        int meses = idade * 12;
        int dias = idade * 365;

        System.out.printf("%d ano = %d meses%n", idade, meses);
        System.out.printf("%d ano = %d dias%n", idade, dias);
    }
}
