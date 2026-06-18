package exerciciodaAula;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeProduto;
        double totalCompra = 0;
        double valorProduto;
        double desconto;
        int quantidadeProdutos = 0;
        int opcao;
        boolean descontoAplicado = false;

        while (true) {
            System.out.println("======== Caixa ========");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Ver total da Compra");
            System.out.println("3 - Aplicar desconto");
            System.out.println("4 - Remover");
            System.out.println("5 - Finalizar compra");
            System.out.print("\nQual opção deseja: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    nomeProduto = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Digite o valor do produto: ");
                    while (!sc.hasNextDouble()) {
                        System.out.println("Valor inválido!");
                        sc.next();
                    }
                    valorProduto = sc.nextDouble();

                    if (valorProduto < 0) {
                        System.out.println("Valor invalido");
                    } else {
                        totalCompra += valorProduto;
                        quantidadeProdutos++;
                    }
                    break;
                case 2:
                    System.out.print("");
                    System.out.printf("Total atual da compra: R$ %.2f%n", totalCompra);
                    System.out.printf("Quantidade atual de produtos: %d%n", quantidadeProdutos);
                    break;
                case 3:
                    if (descontoAplicado ){
                        System.out.println("O desconto já foi aplicado!");
                    }else if (totalCompra > 100.0) {
                        desconto = totalCompra * 0.10;

                        totalCompra = totalCompra - desconto;

                        System.out.printf("Desconto: %.2f%n", desconto);
                        System.out.printf("Novo valor da compra: R$%.2f%n ", totalCompra);
                    } else {
                        System.out.println("A compra ainda não atingiu R$100,00");
                    }
                    break;
                case 4:
                    System.out.print("Digite o Valor a Remover: ");
                    if (!sc.hasNextDouble()) {
                        System.out.print("Erro! Digite um valor decimal correto!");
                        sc.next();
                    }
                    double remove = sc.nextDouble();

                    if (remove > totalCompra) {
                        System.out.println("Não é possível remover esse valor!");
                    } else {
                        totalCompra -= remove;
                        if (quantidadeProdutos > 0) {
                            quantidadeProdutos--;
                        }
                        System.out.printf("Produto removido com sucesso!");
                    }
                    break;
                case 5:
                    System.out.println("\n===== RESUMO DA COMPRA =====");
                    System.out.printf("Quantidade de produtos: %d%n", quantidadeProdutos);
                    System.out.printf("Valor total: R$ %.2f%n", totalCompra);
                    System.out.println("Compra finalizada!");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção invalida ");
                    break;
            }
            System.out.println("\n------------------------------------------------------------------");
            System.out.println("\nEscolha uma nova Opção, ou escolha a opção 5 - Finalizar a compra");
            System.out.println("\n------------------------------------------------------------------");
        }
    }
}