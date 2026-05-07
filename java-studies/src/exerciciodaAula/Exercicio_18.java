package exerciciodaAula;

import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado = 0;
        int opcao = 0;


        while (opcao != 5) {
            System.out.println("\n--- Calculadora ---");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.print("Qual opção você deseja: ");

            opcao = sc.nextInt();


            if (opcao == 5) {
                System.out.println("Você saiu!");
                break; // Caso a oção for 5 saimos do while
            }

            if (opcao < 1 || opcao > 5) {
                System.out.println("Opção inválida! Tente novamente.");
                continue; // Volta para o início do while
            }

            System.out.print("Informe um numero: ");
            int numero = sc.nextInt();
            System.out.print("Informe outro numero: ");
            int outroNumero = sc.nextInt();

            switch (opcao) {
                case 1:
                    resultado = numero + outroNumero;
                    break;
                case 2:
                    resultado = numero - outroNumero;
                    break;
                case 3:
                    resultado = numero * outroNumero;
                    break;
                case 4:
                    if (outroNumero != 0) {
                        resultado = numero / outroNumero;
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                        continue;
                    }
                    break;
            }

            System.out.printf("Você escolheu a opção %d\n", opcao);
            System.out.printf("O resultado é %d\n", resultado);
        }

        System.out.println("Programa encerrado.");
        sc.close();
    }
}