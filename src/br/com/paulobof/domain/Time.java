package br.com.paulobof.domain;

import java.util.Date;
import java.util.List;

public class Time {

    private String nome;
    public List<Jogador> jogadores;
    private String cor1;
    private String cor2;

    public Time() {
    }

    public Time(String nome, List<Jogador> jogadores, String cor1, String cor2) {
        this.nome = nome;
        this.jogadores = jogadores;
        this.cor1 = cor1;
        this.cor2 = cor2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public String getCor1() {
        return cor1;
    }

    public void setCor1(String cor1) {
        this.cor1 = cor1;
    }

    public String getCor2() {
        return cor2;
    }

    public void setCor2(String cor2) {
        this.cor2 = cor2;
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", jogadores=" + jogadores +
                ", cor1='" + cor1 + '\'' +
                ", cor2='" + cor2 + '\'' +
                '}';
    }
}
