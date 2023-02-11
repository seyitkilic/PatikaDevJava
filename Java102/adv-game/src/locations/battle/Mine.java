package locations.battle;

import game.Player;
import obstacles.Snake;

public class Mine extends BattleLocation {
    public Mine(Player player) {
        super(player, "Mine", 6, new Snake(), "null");
    }
}
