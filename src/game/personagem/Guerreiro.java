package game.personagem;

public class Guerreiro extends Personagem{

    public Guerreiro() {
        this.forca = 10;
        this.agilidade = 5;
        this.inteligencia = 2;
        super.init();
    }

    @Override
    public void levelUp(){
        this.forca += 3;
        this.agilidade += 1;
        this.inteligencia += 1;
        super.init();
    }

    @Override
    public String toString() {
        return "Guerreiro" + super.toString();
    }
}
