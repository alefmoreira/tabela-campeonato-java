package model.entities;

import model.entities.Times.Time;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Partida {
    private LocalDateTime dataJogo;

    Time timeCasa;
    Time timeFora;
    private int gol;

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }

    private List<Gols> listGols = new ArrayList<>();

    public Partida(LocalDateTime dataJogo, Time timeCasa, Time timeFora) {
        this.dataJogo = dataJogo;
        this.timeCasa = timeCasa;
        this.timeFora = timeFora;
    }

    public LocalDateTime getDataJogo() {
        return dataJogo;
    }

    public void setDataJogo(LocalDateTime dataJogo) {
        this.dataJogo = dataJogo;
    }

    public Time getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(Time timeCasa) {
        this.timeCasa = timeCasa;
    }

    public Time getTimeFora() {
        return timeFora;
    }

    public void setTimeFora(Time timeFora) {
        this.timeFora = timeFora;
    }

    public List<Gols> getListGols() {
        return listGols;
    }

    public void setListGols(List<Gols> listGols) {
        this.listGols = listGols;
    }
}
