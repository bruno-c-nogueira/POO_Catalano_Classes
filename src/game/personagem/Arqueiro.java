package game.personagem;

public class Arqueiro extends Personagem {

    public Arqueiro() {
        super(5, 10, 2);
    }

    @Override
    public void levelUp() {
        this.levelUp(1, 3, 1);
    }

    @Override
    public String toString() {
        return "Arqueiro" + super.toString();
    }
}
