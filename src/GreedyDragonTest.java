import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreedyDragonTest {

    @Test
    void isGreedy() {
        var dragon = new GreedyDragon();
        assertEquals(true, dragon.isGreedy());
    }
}