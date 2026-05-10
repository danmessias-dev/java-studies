package exerciciodaAula;

import java.util.Locale;
import java.util.Scanner;

//bank-system-java
public class Exercicio_23 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Criando variáveis
        double saldo = 0.0;
        double deposito, sacar;

        // O while mantém rodando até o Usuária(o) informa a opção 4 - Sair
        while (true) {
            System.out.println("\n*------MENU------*");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é R$%.2f%n", saldo);
                    break;
                case 2:
                    System.out.println("Qual Valor deseja Depositar: ");
                    deposito = sc.nextDouble();

                    saldo = saldo + deposito;

                    System.out.printf("Deposito realizado com sucesso! Seu saldo atual é R$%.2f%n", saldo);
                    break;
                case 3:
                    System.out.println("Qual valor deseja Sacar:");
                    sacar = sc.nextDouble();

                    //Valida o Saque: caso o saque seja maior que o saldo, não permitir
                    if (sacar > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - sacar;

                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do Programa!");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção Inválida");
            }
            System.out.println("Escolha um nova Opção, ou escolha a opção 4 - Sair");
        }
    }
}
