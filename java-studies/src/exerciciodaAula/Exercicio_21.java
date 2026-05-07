package exerciciodaAula;

import java.util.Scanner;

public class Exercicio_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        while (senha != 1234){
            System.out.println("Digite a Senha: ");
            senha = sc.nextInt();
        }
        System.out.println("Senha correta");

        sc.close();
    }
}
