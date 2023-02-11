package locations.normal;

import game.Armor;
import game.Player;
import game.Weapon;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Tool Store", 2);
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the TOOL STORE");

        boolean showMenu = true;

        while (showMenu) {
            System.out.println("\n1- WEAPONS");
            System.out.println("2- ARMORS");
            System.out.println("3- GET OUT THE TOOL STORE");

            System.out.print("Your Case : ");
            int selectedCase = in.nextInt();

            while (selectedCase < 1 || selectedCase > 3) {
                System.out.println("TRY AGAIN");
                selectedCase = in.nextInt();
            }

            switch (selectedCase) {
                case 1:
                    printWeapons();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    showMenu = false;
                    return true;
            }

        }

        return true;
    }


    public void printWeapons() {
        System.out.println("\n****************** WEAPONS ******************");

        for (Weapon weapon : Weapon.getWeapons()) {
            System.out.println(weapon.getId() + " - " + weapon.getName() +
                    " < Damage: " + weapon.getDamage() +
                    ", Price: " + weapon.getPrice() + " >");
        }
        System.out.println("0 - Return To The Tool Store Menu");
    }

    public void buyWeapon() {
        System.out.print("Your Weapon : ");
        int selectedWeaponIndex = in.nextInt();

        while (selectedWeaponIndex < 0 || selectedWeaponIndex > Weapon.getWeapons().length) {
            System.out.print("TRY AGAIN : ");
            selectedWeaponIndex = in.nextInt();
        }

        if (selectedWeaponIndex != 0) {
            Weapon selectedWeapon = null;
            switch (selectedWeaponIndex) {
                case 1:
                    selectedWeapon = new Weapon("Pistol", 1, 2, 25);
                    break;
                case 2:
                    selectedWeapon = new Weapon("Sword", 2, 3, 35);
                    break;
                case 3:
                    selectedWeapon = new Weapon("Rifle", 3, 7, 45);
                    break;
            }

            if (selectedWeapon.getPrice() > this.getPlayer().getCoin()) {
                System.out.println("INSUFFICIENT BALANCE");
                System.out.println("You need " +
                        (selectedWeapon.getPrice() - this.getPlayer().getCoin()) +
                        " more money");
            } else {
                System.out.println("On successful purchase: " + selectedWeapon.getName());
                this.getPlayer().setCoin(this.getPlayer().getCoin() - selectedWeapon.getPrice());
                System.out.println("NEW BALANCE : " + this.getPlayer().getCoin());

                this.getPlayer().getInventory().setWeapon(selectedWeapon);
            }
        }
    }

    public void printArmor() {
        System.out.println("\n****************** ARMORS ******************");

        for (Armor armor : Armor.getArmors()) {
            System.out.println(armor.getId() + " - " + armor.getName() +
                    " < Defence: " + armor.getDefence() +
                    ", Price: " + armor.getPrice() + " >");
        }
        System.out.println("0 - Return to the Tool Store Menu");
    }

    public void buyArmor() {
        System.out.print("Your Armor : ");
        int selectedArmorIndex = in.nextInt();

        while (selectedArmorIndex < 0 || selectedArmorIndex > Weapon.getWeapons().length) {
            System.out.print("TRY AGAIN : ");
            selectedArmorIndex = in.nextInt();
        }

        if (selectedArmorIndex != 0) {
            Armor selectedArmor = null;
            switch (selectedArmorIndex) {
                case 1:
                    selectedArmor = new Armor("Light", 1, 1, 15);
                    break;
                case 2:
                    selectedArmor = new Armor("Medium", 2, 3, 25);
                    break;
                case 3:
                    selectedArmor = new Armor("Heavy", 3, 5, 40);
                    break;
            }

            if (selectedArmor.getPrice() > this.getPlayer().getCoin()) {
                System.out.println("INSUFFICIENT BALANCE");
                System.out.println("You need " +
                        (selectedArmor.getPrice() - this.getPlayer().getCoin()) +
                        " more money");
            } else {
                System.out.println("On successful purchase: " + selectedArmor.getName());
                this.getPlayer().setCoin(this.getPlayer().getCoin() - selectedArmor.getPrice());
                System.out.println("NEW BALANCE : " + this.getPlayer().getCoin());

                this.getPlayer().getInventory().setArmor(selectedArmor);
            }
        }
    }
}
