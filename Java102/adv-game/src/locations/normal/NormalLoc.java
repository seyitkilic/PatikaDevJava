package locations.normal;

import game.Player;
import locations.Location;

public abstract class NormalLoc extends Location {
    public NormalLoc(Player player, String name, int id) {
        super(player, name, id);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
