package exerciciodaAula;

import java.util.Scanner;

public class Exercicio_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - X-Burguer\n" +
                           "2 - X-Salada\n" +
                           "3 - Refrigerante\n" +
                           "4 - Suco");

        System.out.println("Escolha uma opção acima: ");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.printf("%d - Você escolheu X-Burguer",opcao);
                break;
            case 2:
                System.out.printf("%d - Você escolheu X-Salada", opcao);
                break;
            case 3:
                System.out.printf("%d - Você escolheu Refrigerante", opcao);
                break;
            case 4:
                System.out.printf("%d - Você escolheu Suco");
                break;
            default:
                System.out.printf("Opcao invalida");
                break;
        }
        scanner.close();
    }
}