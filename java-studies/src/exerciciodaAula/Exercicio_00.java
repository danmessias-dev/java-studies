//Exercício 00 — Leia o nome e a idade de uma pessoa e exiba uma mensagem:
package exerciciodaAula;

import java.util.Scanner;

public class Exercicio_00{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Preencha algumas informação abaixo: ");
        String nome = sc.nextLine();
        int idade = sc.nextInt();

        System.out.printf("Olá, %s! Voce tem %d anos.", nome,idade);
    }
}