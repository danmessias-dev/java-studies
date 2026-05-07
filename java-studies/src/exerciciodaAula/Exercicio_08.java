package exerciciodaAula;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double reajuste = 0.0;
        double percentual = 0.0;

        if (salario <= 1500) {
            percentual = 15;
            reajuste = salario * 0.15;
        } else if (salario <= 3000) {
            percentual = 10;
            reajuste = salario * 0.10;
        } else {
            percentual = 5;
            reajuste = salario * 0.05;
        }

        double novoSalario = salario + reajuste;

        System.out.printf("Salário antigo: %.2f%n", salario);
        System.out.printf("Percentual: %.0f%%%n", percentual);
        System.out.printf("Valor do aumento: %.2f%n", reajuste);
        System.out.printf("Novo salário: %.2f%n", novoSalario);

        sc.close();
    }
}