package model.entities;

import model.entities.Times.Time;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private String nome;
    private Time times;

    List<Time> listTimes = new ArrayList<>();

    public Campeonato(String nome, List<Time> listTimes) {
        this.nome = nome;
        this.listTimes = listTimes;
    }

    public Campeonato(String nome) {
        this.nome = nome;
    }


    public Campeonato(){
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void addTime(Time time){
        listTimes.add(time);
    }
    public void removeTime(Time time){
        listTimes.remove(time);
    }

    public Time getTimes() {
        return times;
    }

    public void setTimes(Time times) {
        this.times = times;
    }

    public List<Time> getListTimes() {
        return listTimes;
    }

    public void setListTimes(List<Time> listTimes) {
        this.listTimes = listTimes;
    }

    @Override
    public String toString() {
        return "Campeonato{" +
                "nome='" + nome + '\'' +
                ", times=" + listTimes ;

    }
}
