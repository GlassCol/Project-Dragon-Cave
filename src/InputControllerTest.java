import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class InputControllerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getGoodInput() {
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        Scanner input = new Scanner(in);
        final int ONE = 1;
        final int TWO = 2;
        int choice = -1;
            if (choice != ONE && choice != TWO) {
                System.out.println("Which cave will you go into? (1 or 2)");
                choice = input.nextInt();
                assertEquals(1, choice);
        }
    }
    @Test
    void getBadInput() {
        ByteArrayInputStream in = new ByteArrayInputStream("cat".getBytes());
        Scanner input = new Scanner(in);
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
        }
    }
}