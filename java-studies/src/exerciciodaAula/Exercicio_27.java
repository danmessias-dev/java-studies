package exerciciodaAula;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_27 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, altura, area;

        System.out.print("Largura da parede: ");
        largura = sc.nextDouble();
        System.out.print("Altura da parede: ");
        altura = sc.nextDouble();

        area = largura * altura;
        System.out.printf("Sua parade tem a dimensão %.2fx%.2f e sua área é de %.2fm%n", largura, altura, area);
        System.out.println("Para pinta essa parede, você precisará de " + (area / 2) + " de tinta.");

        sc.close();
    }
}
