package locations.normal;

import game.Player;

public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Safe House", 1);
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are on Safe House, that means you are in SAFE");
        System.out.println("Your health is gonna full");

        this.getPlayer().setHealth(this.getPlayer().getOrgHealth());

        return true;
    }
}
