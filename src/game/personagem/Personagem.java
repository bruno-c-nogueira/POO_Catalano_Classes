package game.personagem;

import game.equipamento.Bota;

public abstract class Personagem {
    private int forca ;
    private int agilidade ;
    private int inteligencia ;
    private int hp;
    private int mana;
    private int level = 1;
    private Bota bota;

    public Personagem(int forca, int agilidade, int inteligencia) {
        this.setForca(forca);
        this.setAgilidade(agilidade);
        this.setInteligencia(inteligencia);
    }

    /*
        Definir regra para subir de level.
    */
    public abstract void levelUp();

    protected void levelUp(int forca, int agilidade, int inteligencia) {
        this.setLevel(this.getLevel() + 1);
        this.setForca(this.getForca() + forca);
        this.setAgilidade(this.getAgilidade() + agilidade);
        this.setInteligencia(this.getInteligencia() + inteligencia);
    }

    private void init(){
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

    public int getForca() {
        return forca;
    }

    protected void setForca(int forca) {
        if (forca > 0)
            this.forca = forca;
        init();
    }

    public int getAgilidade() {
        return agilidade;
    }

    protected void setAgilidade(int agilidade) {
        if (agilidade > 0)
            this.agilidade = agilidade;
        init();
    }

    public int getInteligencia() {
        return inteligencia;
    }

    protected void setInteligencia(int inteligencia) {
        if (inteligencia > 0)
            this.inteligencia = inteligencia;
        init();
    }

    public int getLevel() {
        return level;
    }

    protected void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return this.hp;
    }

    public int getMana() {
        return this.mana;
    }

    @Override
    public String toString() {
        return "{" +
                "forca=" + this.forca +
                ", agilidade=" + this.agilidade +
                ", inteligencia=" + this.inteligencia +
                ", hp=" + this.hp +
                ", mana=" + this.mana +
                ", level=" + this.level + '}';
    }

}
