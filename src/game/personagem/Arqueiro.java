package game.personagem;

public class Arqueiro extends Personagem {

    public Arqueiro() {
        this.forca = 5;
        this.agilidade = 10;
        this.inteligencia = 2;
        super.init();
    }

    @Override
    public void levelUp() {
        this.forca += 1;
        this.agilidade += 3;
        this.inteligencia += 1;
        super.init();
    }

    @Override
    public String toString() {
        return "Arqueiro" + super.toString();
    }
}
