package obstacles;

import java.util.Random;

public class Snake extends Obstacle{
    public Snake() {
        super("Snake",
                4,
                new Random().nextInt(3) + 3,
                12,
                0);
    }
}
