package br.com.paulobof.domain;

public class Jogo {

    Campo campo;
    Clima clima;
    Time mandante;
    Time visitante;

    public Jogo() {
    }

    public Jogo(Campo campo, Clima clima, Time mandante, Time visitante) {
        this.campo = campo;
        this.clima = clima;
        this.mandante = mandante;
        this.visitante = visitante;
    }

    public Campo getCampo() {
        return campo;
    }

    public void setCampo(Campo campo) {
        this.campo = campo;
    }

    public Clima getClima() {
        return clima;
    }

    public void setClima(Clima clima) {
        this.clima = clima;
    }

    public Time getMandante() {
        return mandante;
    }

    public void setMandante(Time mandante) {
        this.mandante = mandante;
    }

    public Time getVisitante() {
        return visitante;
    }

    public void setVisitante(Time visitante) {
        this.visitante = visitante;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "campo=" + campo +
                ", clima=" + clima +
                ", mandante=" + mandante +
                ", visitante=" + visitante +
                '}';
    }
}
