package locations.battle;

import game.Player;
import obstacles.Zombie;

public class Cave extends BattleLocation{
    public Cave(Player player) {
        super(player, "Cave", 3, new Zombie(), "food");
    }

    @Override
    public boolean onLocation() {
        return super.onLocation();
    }
}
