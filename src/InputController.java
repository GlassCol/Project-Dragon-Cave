import java.util.Scanner;

/**
 * Handles all input from the user
 *
 * @author Cole Glass
 */
public class InputController {
    Scanner input = new Scanner(System.in);

    /**
     * Gets the user input for which cave they want to choose
     *
     * @return choice : int
     */

    public int getUserInput() {
            final int ONE = 1;
            final int TWO = 2;
            int choice = -1;
        try {
                if (choice != ONE && choice != TWO) {
                    System.out.println("Which cave will you go into? (1 or 2)");
                    choice = input.nextInt();
                }
        }
        catch(Exception e){
            System.out.println("Please enter a valid input.");
            input = new Scanner(System.in); // resets the scanner after it has broken
        }
        return choice;
    }
}
