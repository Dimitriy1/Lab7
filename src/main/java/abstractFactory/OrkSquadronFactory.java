package abstractFactory;

public class OrkSquadronFactory implements SquadronFactory {
    @Override
    public Mage createMage() {
        return new OrkMage();
    }

    @Override
    public Archer createArcher() {
        return new OrkArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new OrkWarrior();
    }
}
