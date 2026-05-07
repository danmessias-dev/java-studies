package exerciciodaAula;

import java.util.Scanner;

public class Exercicio_10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = sc.nextInt();

        System.out.println("O antecessor é "+ (numero - 1));
        System.out.println("O sucessor é "+ (numero + 1));
    }
}