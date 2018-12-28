package abstractFactory;

public class Main {
    public static void main(String[] args) {
        Squadron orkSquadron = new Squadron(new OrkSquadronFactory());
        orkSquadron.getMage().cast();
        orkSquadron.getArcher().shoot();
        orkSquadron.getWarrior().attack();

        Squadron elfSquadron = new Squadron(new ElfSquadronFactory());
        elfSquadron.getMage().cast();
        elfSquadron.getArcher().shoot();
        elfSquadron.getWarrior().attack();
    }
}
