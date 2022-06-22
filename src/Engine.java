import java.util.Random;

/**
 * Main engine which pushes the game through its various stages
 *
 * @author Cole Glass
 */
public class Engine {
    FriendlyDragon friendlyDragon = new FriendlyDragon();
    GreedyDragon greedyDragon = new GreedyDragon();
    private final Cave firstCave = new Cave();
    private final Cave secondCave = new Cave();
    private final InputController input = new InputController();
    int userChoice = -1;
    final int ONE = 1;
    final int TWO = 2;

    /**
     * Method which runs the game
     */
    public void run() {
        Random rng = new Random();
        int numOfCaves = 2;
        int flag = rng.nextInt(numOfCaves);
        if (flag == 0) {
            firstCave.setDragon(friendlyDragon);
            secondCave.setDragon(greedyDragon);
        } else {
            firstCave.setDragon(greedyDragon);
            secondCave.setDragon(friendlyDragon);
        }
        displayIntro();
        while (userChoice != ONE && userChoice != TWO) {userChoice = input.getUserInput();}
        if (userChoice == ONE) firstCave.determineFate();
        else secondCave.determineFate();
    }

    /**
     * Displays the introduction to the game and prompts the user for input at the end
     */
    public void displayIntro() {
        System.out.println("""
                You are in a land full of dragons. In front of you,
                you see two caves. In one cave, the dragon is friendly
                and will share his treasure with you. The other dragon
                is greedy and hungry and will eat you on sight\s""");
    }
}
