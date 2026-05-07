/*
 * Exercício:
 * Ler um número inteiro e três textos digitados pelo usuário.
 * Ao final, exibir todos os dados informados.
 */
package exerciciodaAula;

import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        System.out.println("Digite um número:");
        x = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o primeiro texto:");
        s1 = sc.nextLine();

        System.out.println("Digite o segundo texto:");
        s2 = sc.nextLine();

        System.out.println("Digite o terceiro texto:");
        s3 = sc.nextLine();

        System.out.println("\nDADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}

