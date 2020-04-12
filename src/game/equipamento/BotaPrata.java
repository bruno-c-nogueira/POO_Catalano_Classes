package game.equipamento;

public class BotaPrata extends Bota {
    private int forca ;
    private int agilidade ;
    private int inteligencia ;

    public BotaPrata() {
        this.forca = 2;
        this.agilidade = 1;
        this.inteligencia = 1;
    }

    @Override
    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
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

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
}
