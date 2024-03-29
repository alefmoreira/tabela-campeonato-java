package model.entities;

import model.entities.Times.Jogador;



public class Gols {
    private Jogador golsJogadores;

    public Gols(Jogador golsJogadores) {
        this.golsJogadores = golsJogadores;
    }

    public Jogador getGolsJogadores() {
        return golsJogadores;
    }

    public void setGolsJogadores(Jogador golsJogadores) {
        this.golsJogadores = golsJogadores;
    }
}
