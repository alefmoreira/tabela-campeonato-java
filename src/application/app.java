package application;

import entities.Jogador;

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
        Jogador[] dadosJogador = new Jogador[n];
        List<Jogador> listJogadores = new ArrayList<>();

        for (int i=0; i< dadosJogador.length; i++) {
            System.out.print("Nome: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Posição: ");
            String posicao = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Numero camisa: ");
            int camisa = sc.nextInt();
            dadosJogador[i] = new Jogador(name, idade, posicao, camisa);
        }
        for(int i=0; i<dadosJogador.length; i++) {
            listJogadores.add(dadosJogador[i]);
        }
        for (Jogador x : listJogadores){
            System.out.println(x);
        }
        
    }
}
