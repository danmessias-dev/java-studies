package exerciciodaAula;

import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = sc.nextInt();

        while (numero >= 0){ //Sempre vai ent
            System.out.println(numero);
            numero--;
        }
        System.out.println("Fim do Loop");
    }
}
