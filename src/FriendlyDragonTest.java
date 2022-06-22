import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FriendlyDragonTest {

    @Test
    void isGreedy() {
        var dragon = new FriendlyDragon();
        assertEquals(false, dragon.isGreedy());
    }
}