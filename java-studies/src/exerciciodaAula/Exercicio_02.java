//Exercício 2 — Leia o nome e o salário de um funcionário e mostre o salário com 10% de aumento.

package exerciciodaAula;
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = sc.nextLine();
        System.out.println("Informe seu salario atual:");
        double salario = sc.nextDouble();
        double novoSalario;

        novoSalario = salario + (salario * 0.10);

        System.out.printf("Seu novo salario é %.2f",novoSalario);
    }
}