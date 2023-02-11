package locations.battle;

import game.Player;
import obstacles.Vampire;

public class Forest extends BattleLocation{
    public Forest(Player player) {
        super(player, "Forest", 4, new Vampire(), "firewood");
    }
}
