package exerciciodaAula;

import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero");
        int numero = scanner.nextInt();
        System.out.println("Informe outro numero");
        int numero1 = scanner.nextInt();

        if (numero > numero1){
            System.out.println(numero+" é maior que "+numero1);
        }else if (numero1 > numero){
            System.out.println(numero1+" é maior que "+numero);
        }else {
            System.out.println("Ambos são iguais");
        }
    }
}
