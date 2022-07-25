package br.com.paulobof;

import br.com.paulobof.domain.*;
import com.sun.jdi.ArrayReference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Clima clima = new Clima();
        clima.setTemperatura(28.4);
        clima.setUmidadeAr(10.4);
        clima.setVelocidadeVento(5.2);
        clima.setDireçãoVento("NE");
        clima.setVisibilidade(0.9);

        Campo campo = new Campo();
        campo.setNomeCampo("Baetão");
        campo.setCapacidade(1000);
        campo.setComprimento(100);
        campo.setLargura(100);

        Time mandante = new Time();

        mandante.jogadores = new ArrayList<Jogador>();

        mandante.setNome("Time Branco e Vermelho");
        mandante.setCor1("Branco");
        mandante.setCor2("Vermelho");
        for (int i=0 ; i<=14; i++){
            Jogador jogador = new Jogador("Paulo", 30, 1.73, 105.1, i+1);
            mandante.jogadores.add(jogador);
        }

        Time visitante = new Time();

        visitante.jogadores = new ArrayList<Jogador>();

        visitante.setNome("Time Preto e Verde");
        visitante.setCor1("Preto");
        visitante.setCor2("Verde");
        for (int i=0 ; i<=14; i++){
            Jogador jogador = new Jogador("Marcos", 32, 1.75, 104.1, i+1);
            visitante.jogadores.add(jogador);
        }

        System.out.println("Mandante:");
        System.out.println(mandante.toString());

        System.out.println("Visitante:");
        System.out.println(visitante.toString());

        System.out.println("Clima:");
        System.out.println(clima.toString());

        System.out.println("Campo:");
        System.out.println(campo.toString());

        Jogo partida = new Jogo(campo,clima,mandante,visitante);
        System.out.println("-------------------------------");
        System.out.println("Partida:");
        System.out.println(partida.toString());
        System.out.println("-------------------------------");
    }
}
