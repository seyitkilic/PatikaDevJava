package game;

import locations.Location;
import locations.battle.Cave;
import locations.battle.Forest;
import locations.battle.Mine;
import locations.battle.River;
import locations.normal.SafeHouse;
import locations.normal.ToolStore;

import java.util.Scanner;

public class Game {
    private Scanner in = new Scanner(System.in);

    public void start() {
        System.out.print("Your hero's name : ");
        String playerName = in.nextLine();

        Player player = new Player(playerName);
        System.out.println(player.getPlayerName() + " Welcome to the ADV-GAME");

        player.selectChar();

        Location[] locations = { new SafeHouse(player), new ToolStore(player), new Cave(player), new Forest(player),
                new River(player), new Mine(player) };
        Location selectedLocation = null;

        while (true) {
            player.printInfo();

            System.out.println("************ LOCATIONS ************");
            for (Location location : locations) {
                System.out.println("ID: " + location.getId() + "\tLocation: " + location.getName());
            }
            System.out.println("ID: 0\tLocation: QUIT GAME");

            System.out.print("Your location : ");
            int selectedLocationIndex = in.nextInt();
            switch (selectedLocationIndex) {
                case 0:
                    selectedLocation = null;
                    break;
                case 2:
                    selectedLocation = locations[1];
                    break;
                case 3:
                    selectedLocation = locations[2];
                    break;
                case 4:
                    selectedLocation = locations[3];
                    break;
                case 5:
                    selectedLocation = locations[4];
                    break;
                case 6:
                    selectedLocation = locations[5];
                    break;
                default:
                    selectedLocation = locations[0];
            }
            System.out.println("************ LOCATIONS ************\n");

            if (selectedLocation == null) {
                System.out.println("You break the GAME");
                break;
            }
            if (!selectedLocation.onLocation()) {
                System.out.println("GAME OVER");
                break;
            }
        }
    }
}
