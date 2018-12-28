package abstractFactory;

public class Squadron {
    private Mage mage;
    private Archer archer;
    private Warrior warrior;

    public Squadron(SquadronFactory squadronFactory) {
        this.mage = squadronFactory.createMage();
        this.archer = squadronFactory.createArcher();
        this.warrior = squadronFactory.createWarrior();
    }

    public Mage getMage() {
        return mage;
    }

    public Archer getArcher() {
        return archer;
    }

    public Warrior getWarrior() {
        return warrior;
    }
}
