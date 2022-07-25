package br.com.paulobof.domain;

public class Clima {

    private Double temperatura;
    private Double umidadeAr;
    private Double velocidadeVento;
    private String direçãoVento;
    private Double visibilidade;

    public Clima() {
    }

    public Clima(Double temperatura, Double umidadeAr, Double velocidadeVento, String direçãoVento, Double visibilidade) {
        this.temperatura = temperatura;
        this.umidadeAr = umidadeAr;
        this.velocidadeVento = velocidadeVento;
        this.direçãoVento = direçãoVento;
        this.visibilidade = visibilidade;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Double getUmidadeAr() {
        return umidadeAr;
    }

    public void setUmidadeAr(Double umidadeAr) {
        this.umidadeAr = umidadeAr;
    }

    public Double getVelocidadeVento() {
        return velocidadeVento;
    }

    public void setVelocidadeVento(Double velocidadeVento) {
        this.velocidadeVento = velocidadeVento;
    }

    public String getDireçãoVento() {
        return direçãoVento;
    }

    public void setDireçãoVento(String direçãoVento) {
        this.direçãoVento = direçãoVento;
    }

    public Double getVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(Double visibilidade) {
        this.visibilidade = visibilidade;
    }

    @Override
    public String toString() {
        return "Clima{" +
                "temperatura=" + temperatura +
                ", umidadeAr=" + umidadeAr +
                ", velocidadeVento=" + velocidadeVento +
                ", direçãoVento='" + direçãoVento + '\'' +
                ", visibilidade=" + visibilidade +
                '}';
    }
}
