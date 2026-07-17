package exerciciodaAula;

import java.util.Scanner;

public class Exercicio_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float distancia = 0F, centimetros, milimetros;

        System.out.print("Uma distância em metros: ");
        distancia = sc.nextFloat();

        centimetros = distancia * 100;
        milimetros = distancia * 1000;

        System.out.printf("A media de %.1fm corresponde a %.0fcm e %.0fmm", distancia, centimetros,milimetros);

        sc.close();
    }
}
