import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> evenTeams = new ArrayList<>();
        evenTeams.add("Galatasaray");
        evenTeams.add("Bursaspor");
        evenTeams.add("Fenerbahçe");
        evenTeams.add("Beşiktaş");
        evenTeams.add("Başakşehir");
        evenTeams.add("Boluspor");

        List<String> oddTeams = new ArrayList<>();
        oddTeams.add("Galatasaray");
        oddTeams.add("Bursaspor");
        oddTeams.add("Fenerbahçe");
        oddTeams.add("Beşiktaş");
        oddTeams.add("Başakşehir");
        oddTeams.add("Boluspor");
        oddTeams.add("Kayserispor");

        FixtureGenerator fixtureGenerator = new FixtureGenerator(evenTeams);
        List<String> fixtures = fixtureGenerator.generateFixtures();
        fixtureGenerator.printFixtures();
    }
}