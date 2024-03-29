package model.entities.Times;



import java.time.format.DateTimeFormatter;

public class Jogador {
    private int id;
    private String nome;
    private Integer idade;
    private String posicao;
    private Integer numCamisa;
    private ContratoJogador contratoJogador;
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Jogador(int id, String nome, Integer idade, String posicao, Integer numCamisa) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numCamisa = numCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Integer getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(Integer numCamisa) {
        this.numCamisa = numCamisa;
    }

    @Override
    public String toString() {
        return nome
               + ", idade: "
               + idade
               +", Posição: "
               + posicao
               + ", Numero: "
               + numCamisa;

    }
}


