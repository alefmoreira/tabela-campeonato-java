package application;

import entities.Jogador;
import entities.Time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o numero de jogadores que vc quer cadastar: ");
        int n = sc.nextInt();


        Time corinthians = new Time("Corinthians", "São Paulo", "Preto/Branco");

        for (int i=0; i< n; i++) {
            System.out.print("Nome: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Posição: ");
            String posicao = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Numero camisa: ");
            int camisa = sc.nextInt();
            System.out.print("Digite quantos anos de contrato: ");
            int duracaoContrato = sc.nextInt();

            LocalDate inicioContrato = LocalDate.now(ZoneId.systemDefault());
            LocalDate fimContrato = inicioContrato.plusYears(duracaoContrato);
            Jogador jogadorCorinthians = new Jogador(name, idade,posicao, camisa, fimContrato);
            corinthians.addJogador(jogadorCorinthians);
            System.out.println(jogadorCorinthians);
        }

        
    }
}
