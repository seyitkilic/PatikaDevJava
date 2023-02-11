package locations.battle;

import game.Armor;
import game.Player;
import game.Weapon;
import locations.Location;
import obstacles.Obstacle;

import java.util.Random;

public abstract class BattleLocation extends Location {
    private Obstacle obstacle;
    private String award;

    public BattleLocation(Player player, String name, int id, Obstacle obstacle, String award) {
        super(player, name, id);
        this.award = award;
        this.obstacle = obstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber;

        if (getName().equals("Mine")) {
            obsNumber = this.randomObstacleNumber(5);
        } else {
            obsNumber = this.randomObstacleNumber(3);
        }

        System.out.println("You are at " + this.getName() + " now");
        System.out.println("Be careful, there may be " + obsNumber + " " + this.getObstacle().getName() + "s here");

        System.out.print("\nIf you want to fight for them PRESS 1 : ");
        int selectedCase = in.nextInt();

        if (selectedCase == 1) {
            System.out.println("TO WAR!!!!!");
            if (combat(obsNumber)) {
                System.out.println(this.getName() + " all obstacles are defeated! Congrats!");

                if (this.award.equals("food") && !this.getPlayer().getInventory().isFood()) {
                    System.out.println("You earned food treasure");
                    this.getPlayer().getInventory().setFood(true);
                } else if (this.award.equals("water") && !this.getPlayer().getInventory().isWater()) {
                    System.out.println("You earned water treasure");
                    this.getPlayer().getInventory().setWater(true);
                } else if (this.award.equals("firewood") && !this.getPlayer().getInventory().isFirewood()) {
                    System.out.println("You earned firewood treasure");
                    this.getPlayer().getInventory().setFirewood(true);
                }

                if (this.getPlayer().getInventory().isFood() && this.getPlayer().getInventory().isWater()
                        && this.getPlayer().getInventory().isFirewood()) {
                    System.out.println("YOU WON THAT GAME");
                    System.out.println("CONGRATS!!!!!");
                    return false;
                }

                return true;
            } else {
                System.out.println("You can't play anymore, because YOU ARE DEAD");
                return false;
            }
        } else {
            System.out.println("Run out and turn to Safe House");
        }

        return true;
    }

    public boolean combat(int obsNumber) {
        Random r = new Random();
        boolean isMyTurn = r.nextBoolean();

        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOrgHealth());
            playerStats();
            obstacleStats(i);

            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                if (isMyTurn) {
                    playersTurn(i);
                    if (this.getObstacle().getHealth() > 0) {
                        obstaclesTurn(i);
                    }
                } else {
                    obstaclesTurn(i);
                    if (this.getPlayer().getHealth() > 0) {
                        playersTurn(i);
                    }
                }
            }
        }

        if (this.getPlayer().getHealth() > 0) {
            if (this.getObstacle().getName().equals("Snake")) {
                Object gainedAward = getMineAward();
                if (gainedAward == null) {
                    System.out.println("\nYou get nothing! SRY");
                } else if (gainedAward instanceof Integer) {
                    System.out.println("\nYou earned some money : " + gainedAward);
                    this.getPlayer().setCoin(this.getPlayer().getCoin() + (int) gainedAward);
                } else if (gainedAward instanceof Weapon) {
                    System.out.println("\nYou earned a Weapon! : " + ((Weapon) gainedAward).getName());
                    this.getPlayer().getInventory().setWeapon((Weapon) gainedAward);
                } else {
                    System.out.println("\nYou earned an Armor! : " + ((Armor) gainedAward).getName());
                    this.getPlayer().getInventory().setArmor((Armor) gainedAward);
                }
            } else {
                int earnedMoney = obsNumber * this.getObstacle().getCoin();
                System.out.println("\nYou earned money : " + earnedMoney);
                this.getPlayer().setCoin(this.getPlayer().getCoin() + earnedMoney);
            }

            return true;
        }

        return false;
    }

    public Object getMineAward() {
        Random r = new Random();
        int classPercentage = r.nextInt(100);
        int percentage = r.nextInt(100);

        Object gainedAward = null;

        if (classPercentage >= 0 && classPercentage < 15) {
            if (percentage >= 0 && percentage < 20) {
                gainedAward = new Weapon("Rifle", 3, 7, 45);
            } else if (percentage >= 20 && percentage < 50) {
                gainedAward = new Weapon("Sword", 2, 3, 35);
            } else {
                gainedAward = new Weapon("Pistol", 1, 2, 25);
            }
        } else if (classPercentage >= 15 && classPercentage < 30) {
            if (percentage >= 0 && percentage < 20) {
                gainedAward = new Armor("Heavy", 3, 5, 40);
            } else if (percentage >= 20 && percentage < 50) {
                gainedAward = new Armor("Medium", 2, 3, 25);
            } else {
                gainedAward = new Armor("Light", 1, 1, 15);
            }
        } else if (classPercentage >= 55) {
            gainedAward = null;
        } else {
            if (percentage >= 0 && percentage < 20) {
                gainedAward = 10;
            } else if (percentage >= 20 && percentage < 50) {
                gainedAward = 5;
            } else {
                gainedAward = 1;
            }
        }

        return gainedAward;
    }

    public void playersTurn(int i) {
        System.out.println("\nYour Turn");
        this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getSumDamage());
        afterHit(i);
    }

    public void obstaclesTurn(int i) {
        System.out.println("\n" + this.getObstacle().getName() + "'s Turn");
        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getDefence();
        if (obstacleDamage < 0) {
            obstacleDamage = 0;
        }
        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
        afterHit(i);
    }

    public void afterHit(int i) {
        System.out.println("*********** AFTER HIT ***********");
        System.out.println("Your remaining health : " + this.getPlayer().getHealth());
        System.out.println(
                i + ". " + this.getObstacle().getName() + "'s remaining health : " + this.getObstacle().getHealth());
        System.out.println("*********** AFTER HIT ***********");
    }

    public void playerStats() {
        System.out.println("\n*********** PLAYER STATS ***********");
        System.out.println("Health : " + this.getPlayer().getHealth());
        System.out.println("Weapon : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Damage : " + this.getPlayer().getSumDamage());
        System.out.println("Armor : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Defence : " + this.getPlayer().getInventory().getArmor().getDefence());
        System.out.println("Money : " + this.getPlayer().getCoin());
        System.out.println("*********** PLAYER STATS ***********\n");
    }

    public void obstacleStats(int i) {
        System.out.println("*********** " + i + ". " + this.getObstacle().getName() + " STATS ***********");
        System.out.println("Health : " + this.getObstacle().getHealth());
        System.out.println("Damage : " + this.getObstacle().getDamage());
        System.out.println("Money : " + this.getObstacle().getCoin());
        System.out.println("*********** " + i + ". " + this.getObstacle().getName() + " STATS ***********");
    }

    public int randomObstacleNumber(int i) {
        Random r = new Random();
        return r.nextInt(i) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
