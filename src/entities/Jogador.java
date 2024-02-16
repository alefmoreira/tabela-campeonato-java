package entities;

public class Jogador {
    private String nome;
    private int idade;
    private String posicao;
    private int numCamisa;

    public Jogador(){

    }

    public Jogador(String nome, String posicao, int numCamisa) {
        this.nome = nome;
        this.posicao = posicao;
        this.numCamisa = numCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }
}
