package main;

import main.model.personagem.concreto.Guerreiro;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {


        Guerreiro g1 = new Guerreiro("SEXLOVER");
        g1.receberDano(20);
        g1.defender(20);
    }

    }
