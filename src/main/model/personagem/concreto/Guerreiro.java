package main.model.personagem.concreto;

import main.model.personagem.Personagem;

public class Guerreiro extends Personagem {
    private int escudo = 3;

    public Guerreiro(String nome) {
        super(nome);
        this.escudo= escudo;
    }

    public void defender(int escudo){
        escudo = escudo -1;
        System.out.println(nome+" Defende!");
    }
}
