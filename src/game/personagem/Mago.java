package game.personagem;

import game.equipamento.Bota;

public class Mago {
    private int forca ;
    private int agilidade ;
    private int inteligencia ;

    private int hp;
    private int mana;

    public Mago() {
        this.forca += 2;
        this.agilidade  += 5;
        this.inteligencia  += 10;
        init();

    }

    public void lvl(){
        this.forca += 1;
        this.agilidade += 1;
        this.inteligencia += 3;
        init();
    }

    private void init(){
        this.hp = 100 * this.forca;
        this.mana = 100 * this.inteligencia;
    }

    public void equiparBota( Bota bota){
        forca += bota.getForca();
        agilidade += bota.getAgilidade();
        inteligencia += bota.getInteligencia();
        init();
    }

    @Override
    public String toString() {
        return "Guerreiro{" +
                "forca=" + forca +
                ", agilidade=" + agilidade +
                ", inteligencia=" + inteligencia +
                ", hp=" + hp +
                ", mana=" + mana +'}';
    }
}
