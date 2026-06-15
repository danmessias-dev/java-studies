package exerciciodaAula;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_24 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String produto, cupom = "";
        double preco, valorTotal = 0.0;
        int totalItens = 0;

        while (true) {
            System.out.print("Produto: ");
            produto = sc.nextLine();
            System.out.print("Preço: ");
            preco = sc.nextDouble();
            sc.nextLine();

            if (preco == 0) {
                break;
            }

            cupom = cupom + " Produto: " + produto + "  R$ " + preco + "\n";

            totalItens = totalItens + 1;
            valorTotal = valorTotal + preco;
        }

        System.out.print("\n===== CUPOM FISCAL =====\n");
        System.out.println(cupom);
        System.out.println("========================");
        System.out.println("Total de Itens: " + totalItens);
        System.out.printf("Total da Compra: %.2f%n", valorTotal);

        sc.close();
    }
}
