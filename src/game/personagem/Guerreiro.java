package game.personagem;

public class Guerreiro extends Personagem{

    public Guerreiro() {
       super(10, 5, 2);
    }

    @Override
    public void levelUp() {
        this.levelUp(3, 1, 1);
    }

    @Override
    public String toString() {
        return "Guerreiro" + super.toString();
    }
}
