package game;

import game.equipamento.BotaBronze;
import game.equipamento.BotaPrata;
import game.personagem.Arqueiro;
import game.personagem.Guerreiro;

public class Main {
    public static void main(String[] args) {

        System.out.println("GURREIRO");
        Guerreiro guerreiro = new Guerreiro();
        System.out.println("INICIALIZANDO");
        System.out.println(guerreiro);
        System.out.println("LVL UP");
        guerreiro.levelUp();
        System.out.println(guerreiro);
        System.out.println("BOTA PRATA");
        guerreiro.equiparBota(new BotaPrata());
        System.out.println(guerreiro);
        System.out.println("BOTA BRONZE");
        guerreiro.equiparBota(new BotaBronze());
        System.out.println(guerreiro);


        System.out.println("ARQUEIRO");
        Arqueiro arqueiro = new Arqueiro();
        System.out.println("INICIALIZANDO");
        System.out.println(arqueiro);
        System.out.println("LVL UP");
        arqueiro.levelUp();
        System.out.println(arqueiro);
        System.out.println("BOTA PRATA");
        arqueiro.equiparBota(new BotaPrata());
        System.out.println(arqueiro);
        System.out.println("BOTA BRONZE");
        arqueiro.equiparBota(new BotaBronze());
        System.out.println(arqueiro);


    }
}
