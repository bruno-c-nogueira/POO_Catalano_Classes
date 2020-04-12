package game;

import game.equipamento.BotaPrata;
import game.personagem.Guerreiro;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro();
        System.out.println("INICIALIZANDO");
        System.out.println(guerreiro);
        System.out.println("LVL UP");
        guerreiro.lvl();
        System.out.println(guerreiro);
        System.out.println("BOTA PRATA");
        guerreiro.equiparBota(new BotaPrata());
        System.out.println(guerreiro);
    }
}
