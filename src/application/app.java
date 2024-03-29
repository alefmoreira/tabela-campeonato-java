package application;
import model.entities.Campeonato;
import model.entities.Gols;
import model.entities.Partida;
import model.entities.Times.Jogador;
import model.entities.Times.ResultadoPartida;
import model.entities.Times.Time;
import model.enums.StatusPartida;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        List<Time> listTimes = new ArrayList<>();
        listTimes.add(new Time("Corinthians", "São Paulo", "Preto/Branco"));
        listTimes.add(new Time("Flamengo", "Rio de Janeiro", "Vermelho/Negro"));
        listTimes.add(new Time("Palmeiras", "São Paulo", "Verde/Amarelo"));
        listTimes.add(new Time("Santos", "Santos", "Preto/Branco"));
        listTimes.add(new Time("São Paulo", "São Paulo", "Preto/Branco"));
        listTimes.add(new Time("Internacional", "Porto Alegre", "Vermelho"));
        listTimes.add(new Time("Grêmio", "Porto Alegre", "Azul/Preto"));
        listTimes.add(new Time("Atlético Mineiro", "Belo Horizonte", "Preto/Branco"));
        listTimes.add(new Time("Cruzeiro", "Belo Horizonte", "Azul/Branco"));
        listTimes.add(new Time("Fluminense", "Rio de Janeiro", "Verde/Branco"));
        listTimes.add(new Time("Botafogo", "Rio de Janeiro", "Preto/Branco"));
        listTimes.add(new Time("Vasco", "Rio de Janeiro", "Preto/Branco"));
        listTimes.add(new Time("Corinthians", "São Paulo", "Preto/Branco"));
        listTimes.add(new Time("Athletico Paranaense", "Curitiba", "Preto/Vermelho"));
        listTimes.add(new Time("Bahia", "Salvador", "Azul/Vermelho"));
        listTimes.add(new Time("Sport", "Recife", "Vermelho/Preto"));
        listTimes.add(new Time("Ceará", "Fortaleza", "Preto/Branco"));
        listTimes.add(new Time("Fortaleza", "Fortaleza", "Azul/Vermelho"));
        listTimes.add(new Time("Goiás", "Goiânia", "Verde/Branco"));
        listTimes.add(new Time("Red Bull Bragantino", "Bragança Paulista", "Vermelho/Preto"));
        listTimes.add(new Time("Coritiba", "Curitiba", "Verde/Branco"));
        Campeonato campeonatoBR = new Campeonato("Brasileirão", listTimes);

        for (int i=0; i< listTimes.size(); i++) {
            for (int j = 0; j <11; j++) {
                int id = j;
                int camisa = j;
                Jogador jogador = new Jogador(id, "nome", 0, "posicao", camisa);
                listTimes.get(i).addJogador(jogador);
            }
        }

        Partida partida = new Partida(LocalDateTime.now(), listTimes.get(0), listTimes.get(1));
        Gols gols = new Gols(listTimes.get(0).getListJogadores().get(0));

        ResultadoPartida resultadoPartida = new ResultadoPartida(partida, StatusPartida.TIME_CASA_GANHOU);
        resultadoPartida.resultadoPartida(partida);
        
    }
}
