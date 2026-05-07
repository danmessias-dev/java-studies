package exerciciodaAula;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base: ");
        int base = sc.nextInt();
        System.out.println("Digite a altura: ");
        int altura = sc.nextInt();

        int areaTriangulo = base * altura;

        System.out.println("A area do Triangulo é "+areaTriangulo);
    }
}
