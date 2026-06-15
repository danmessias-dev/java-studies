package exerciciodaAula;

import java.util.Scanner;

public class Exercicio_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeCachorro;
        int idadeCachorro, idadeHumanaDoCachorro;

        System.out.print("Nome do Cachorro: ");
        nomeCachorro = sc.nextLine();
        System.out.print("Idade do Cachorro: ");
        while (!sc.hasNextInt()){
            System.out.println("Erro! Digite um número inteiro.");
            sc.next();
        }
        idadeCachorro = sc.nextInt();

        if (idadeCachorro > 0) {
            idadeHumanaDoCachorro = idadeCachorro * 7;
            System.out.printf("Nome %s, idade %d e idade humana é %d anos ", nomeCachorro, idadeCachorro, idadeHumanaDoCachorro);
        } else {
            System.out.println("ERRO!" + " - " + " Idade não exite!");
        }

        sc.close();
    }
}
