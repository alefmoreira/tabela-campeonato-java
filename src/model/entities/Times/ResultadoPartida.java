package model.entities.Times;

import model.entities.Gols;
import model.entities.Partida;
import model.enums.StatusPartida;

public class ResultadoPartida {
    private Partida partida;
    private StatusPartida resultadoPartida;

    public ResultadoPartida(Partida partida, StatusPartida resultadoPartida) {
        this.partida = partida;
        this.resultadoPartida = resultadoPartida;
    }
    public ResultadoPartida(){}

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public StatusPartida getResultadoPartida() {
        return resultadoPartida;
    }

    public void setResultadoPartida(StatusPartida resultadoPartida) {
        this.resultadoPartida = resultadoPartida;
    }
    public void resultadoPartida(Partida partida){
        int golFora = 0;
        int golCasa = 0;
        for (Gols g : partida.getListGols()){
            int n = partida.getListGols().size();
          String nome = g.getGolsJogadores().getNome();
          if (nome == partida.getTimeCasa().getListJogadores().get(n).getNome()) {
              golFora += 1;
          } else if (nome == partida.getTimeFora().getListJogadores().get(n).getNome()){
                golCasa += 1;
          }
        }
        if (golCasa > golFora){
            System.out.println(StatusPartida.TIME_CASA_GANHOU);
        }else if (golCasa < golFora){
            System.out.println(StatusPartida.TIME_FORA_GANHOU);
        }
        System.out.println(StatusPartida.EMPATE);
        }

    }

