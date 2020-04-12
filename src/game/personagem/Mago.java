package game.personagem;

public class Mago extends Personagem {

    public Mago() {
        this.forca = 2;
        this.agilidade = 5;
        this.inteligencia = 10;
        super.init();
    }

    @Override
    public void levelUp(){
        this.forca += 1;
        this.agilidade += 1;
        this.inteligencia += 3;
        super.init();
    }

    @Override
    public String toString() {
        return "Guerreiro" + super.toString();
    }
}
