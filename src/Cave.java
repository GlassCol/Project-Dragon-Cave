/**
 * Contains logic and data on a cave
 *
 * @author Cole Glass
 */
public class Cave {
    Dragon myDragon;

    public Cave() {
    }

    public void setDragon(Dragon dragon) {
        this.myDragon = dragon;
    }

    /**
     * shows the player their fate
     */
    public void determineFate() {
        if (myDragon.isGreedy()) {
            System.out.println("The greedy dragon has eaten you!\nGAME OVER");
        } else {
            System.out.println("The friendly dragon has shared their treasure with you!\nYOU WIN");
        }
    }
}
