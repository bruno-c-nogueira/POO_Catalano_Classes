package game.equipamento;

public class BotaBronze extends Bota {
    private int forca;
    private int agilidade;
    private int inteligencia;

    public BotaBronze() {
        this.forca = 1;
        this.agilidade = 1;
        this.inteligencia = 1;
    }

    @Override
    public int getForca() {
        return forca;
    }


    @Override
    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    @Override
    public int getInteligencia() {
        return inteligencia;
    }

}
