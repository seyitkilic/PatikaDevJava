package game;

import character.Archer;
import character.GameCharacter;
import character.Knight;
import character.Samurai;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int orgHealth;
    private int coin;
    private String playerName;
    private String charName;
    private Inventory inventory;
    private Scanner in = new Scanner(System.in);

    public Player(String playerName) {
        this.playerName = playerName;
        this.inventory = new Inventory();
    }

    public void printInfo() {
        System.out.println("\n************ Player Info ************");
        System.out.println("Your Weapon : " + this.getInventory().getWeapon().getName() +
                ", Your Armor: " + this.getInventory().getArmor().getName() +
                ", Your Damage: " + this.getSumDamage() +
                ", Your Health: " + this.getHealth() +
                ", \nYour Defence: " + this.getInventory().getArmor().getDefence() +
                ", Your Money: " + this.getCoin());
        System.out.println("************ Player Info ************\n");
    }

    public void selectChar() {
        GameCharacter[] chars = {new Samurai(), new Archer(), new Knight()};
        System.out.println("********************** CHARACTERS **********************");
        for (GameCharacter gameChar : chars) {
            System.out.println("ID: " + gameChar.getId() +
                    "\tCharacter: " + gameChar.getName() +
                    "\tDamage: " + gameChar.getDamage() +
                    "\tHealth: " + gameChar.getHealth() +
                    "\tCoin: " + gameChar.getMoney());
        }

        System.out.print("Your character : ");
        int selectedChar = in.nextInt();

        switch (selectedChar) {
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
    }

    public void initPlayer(GameCharacter gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOrgHealth(gameChar.getHealth());
        this.setCoin(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getSumDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getOrgHealth() {
        return orgHealth;
    }

    public void setOrgHealth(int orgHealth) {
        this.orgHealth = orgHealth;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
