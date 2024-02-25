package entities;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private String nome;

    private Time times;

    List<Time> listTimes = new ArrayList<>();
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

}
