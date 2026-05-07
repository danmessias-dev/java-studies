package exerciciodaAula;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String loginCorreto = "admin";
        int senhaCorreta = 1234;

        String acesso = "";
        int password = 0;


        boolean acessoGarantido = false;

        while (!acessoGarantido) {
            System.out.println("--- Informe seus dados ---");

            System.out.print("Login: ");
            acesso = scanner.nextLine();

            System.out.print("Senha: ");
            password = scanner.nextInt();
            scanner.nextLine();


            if (acesso.equals(loginCorreto) && password == senhaCorreta) {
                System.out.println("\n ACESSO PERMITIDO!");
                acessoGarantido = true;
            } else {

                System.out.println("\n Dados incorretos. Tente novamente abaixo:");
                System.out.println("-------------------------------------------");
            }
        }

        System.out.println("Bem-vindo ao sistema administrativo.");
        scanner.close();
    }
}