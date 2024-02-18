package entities;

import java.util.List;

public class Time {
    private String nome;
    private String cidade;
    private String cores;

    public Time(String nome) {
        this.nome = nome;
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

}
