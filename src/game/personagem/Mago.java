package game.personagem;

public class Mago extends Personagem {

    public Mago() {
        super(2, 5, 10);
    }

    @Override
    public void levelUp() {
        super.levelUp(1, 1, 3);
    }

    @Override
    public String toString() {
        return "Guerreiro" + super.toString();
    }
}
