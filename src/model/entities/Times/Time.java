package model.entities.Times;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String cidade;
    private String cores;
    private List<Jogador> listJogadores = new ArrayList<>();

    public Time(String nome, String cidade, String cores,  List<Jogador> listJogadores) {
        this.nome = nome;
        this.cidade = cidade;
        this.cores = cores;
        this.listJogadores = listJogadores;
    }

    public Time(String nome, String cidade, String cores) {
        this.nome = nome;
        this.cidade = cidade;
        this.cores = cores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public List<Jogador> getListJogadores() {
        return listJogadores;
    }

    public void setListJogadores(List<Jogador> listJogadores) {
        this.listJogadores = listJogadores;
    }

    public void addJogador(Jogador jogador){
        listJogadores.add(jogador);
    }
    public void removeJogador(Jogador jogador){
        listJogadores.remove(jogador);
    }

    @Override
    public String toString() {
        return "Time{" + nome + " " + cidade;
    }
}
