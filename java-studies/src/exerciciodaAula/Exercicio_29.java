package exerciciodaAula;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String nome, dataNascimento;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Informe sua data de Nascimento: ");
        dataNascimento = sc.nextLine();

        LocalDate data = LocalDate.parse(dataNascimento, fmt1);

        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + data);

        sc.close();
    }
}
