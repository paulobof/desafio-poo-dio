package br.com.paulobof.domain;

public class Campo {

    private String nomeCampo;
    private int largura;
    private int comprimento;
    private int capacidade;

    public Campo() {
    }

    public Campo(String nomeCampo, int largura, int comprimento, int capacidade) {
        this.nomeCampo = nomeCampo;
        this.largura = largura;
        this.comprimento = comprimento;
        this.capacidade = capacidade;
    }

    public String getNomeCampo() {
        return nomeCampo;
    }

    public void setNomeCampo(String nomeCampo) {
        this.nomeCampo = nomeCampo;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Campo{" +
                "nomeCampo='" + nomeCampo + '\'' +
                ", largura=" + largura +
                ", comprimento=" + comprimento +
                ", capacidade=" + capacidade +
                '}';
    }
}
