package game.equipamento;

public class BotaPrata extends Bota {
    private int forca;
    private int agilidade;
    private int inteligencia;

    public BotaPrata() {
        this.forca = 2;
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


    @Override
    public int getInteligencia() {
        return inteligencia;
    }

}
