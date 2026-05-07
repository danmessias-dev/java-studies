

package exerciciodaAula;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o valor da compra: ");
        double valor = sc.nextDouble();

        double desconto = 0.0;

        if (valor > 100.00) {
            desconto = valor * 0.10;
        } else if (valor > 50.00 && valor <= 100.00) { 
            desconto = valor * 0.05;
        } else {
            System.out.println("Sem desconto!");
        }

        if (desconto > 0.0) {
            System.out.printf("Desconto: R$ %.2f%n", desconto);
            System.out.printf("Total a pagar: R$ %.2f%n", valor - desconto);
        }

        sc.close();
    }
}