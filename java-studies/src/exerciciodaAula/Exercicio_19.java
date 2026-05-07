package exerciciodaAula;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorCompra = sc.nextDouble();
        double novoValor = valorCompra;
        double desconto = 0.0;

        if (valorCompra <= 50.00) {
            System.out.println("Sem desconto");
        } else if (valorCompra >= 51.00 && valorCompra <= 100.00) {
            desconto = valorCompra * 0.05;
            novoValor = valorCompra - desconto;
        } else {
            desconto = valorCompra * 0.10;
            novoValor = valorCompra - desconto;
        }

        System.out.printf("Valor original: %.2f%n", valorCompra);
        System.out.printf("Desconto: %.2f%n", desconto);
        System.out.printf("Valor final: %.2f%n", novoValor);

        sc.close();
    }
}