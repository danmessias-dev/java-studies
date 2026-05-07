//Exercício 5 — Leia três notas de um aluno, calcule a média e diga se ele foi aprovado (média ≥ 7),
// em recuperação (média entre 5 e 6.9) ou reprovado (média < 5).

package exerciciodaAula;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 1 nota: ");
        double nota = scanner.nextDouble();
        System.out.println("Informe 2 nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Informe 3 nota: ");
        double nota2 = scanner.nextDouble();
        double media = (nota + nota1 + nota2) / 3;

        System.out.printf("Você tirou no total %.1f%n", media);

        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media >= 5 && media < 6.9) {
            System.out.println("Em recuperação");
        }else {
            System.out.println("Reprovado");
        }
        scanner.close();
    }
}