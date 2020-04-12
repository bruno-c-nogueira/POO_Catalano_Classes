package game.personagem;

import game.equipamento.Bota;

public abstract class Personagem {
    protected int forca ;
    protected int agilidade ;
    protected int inteligencia ;

    private int hp;
    private int mana;
    private Bota bota;

    public abstract void levelUp();

    protected void init(){
        this.hp = 100 * this.forca;
        this.mana = 100 * this.inteligencia;
    }

    public void equiparBota(Bota bota){
        /*
         Remove se tiver bota equipada e seta novos dados.
         */
        if (this.bota != null) {
            this.forca -= this.bota.getForca();
            this.agilidade -= this.bota.getAgilidade();
            this.inteligencia -= this.bota.getInteligencia();
            this.bota = null;
        }
        this.bota = bota;
        this.forca += bota.getForca();
        this.agilidade += bota.getAgilidade();
        this.inteligencia += bota.getInteligencia();
        init();
    }

    @Override
    public String toString() {
        return "{" +
                "forca=" + this.forca +
                ", agilidade=" + this.agilidade +
                ", inteligencia=" + this.inteligencia +
                ", hp=" + this.hp +
                ", mana=" + this.mana +'}';
    }
}
