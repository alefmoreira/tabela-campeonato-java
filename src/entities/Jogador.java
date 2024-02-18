package entities;

public class Jogador {
    private String nome;
    private Integer idade;
    private String posicao;
    private Integer numCamisa;

    public Jogador(String nome, Integer idade, String posicao, Integer numCamisa) {
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


