package main.model.personagem.concreto;

import main.model.personagem.Personagem;

public class Guerreiro extends Personagem {
    private int escudo;

    public Guerreiro(String nome) {
        super(nome);
        this.escudo= 3;
    }

    public void defender(int escudo){
        escudo = escudo -1;
        System.out.println(nome+" Defende!");
    }
}
