package locations.battle;

import game.Player;
import obstacles.Bear;

public class River extends BattleLocation{
    public River(Player player) {
        super(player, "River", 5, new Bear(), "water");
    }
}
