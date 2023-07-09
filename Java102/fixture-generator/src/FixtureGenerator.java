import java.util.*;

public class FixtureGenerator {
    private List<String> teams;
    private List<String> firstFixture;
    private List<String> secondFixture;

    public FixtureGenerator(List<String> teams) {
        this.teams = teams;
        this.firstFixture = new ArrayList<>();
        this.secondFixture = new ArrayList<>();
    }

    public List<String> generateFixtures() {
        List<String> pairedTeams = new ArrayList<>(teams);
        List<String> fixture = new ArrayList<>();

        if (pairedTeams.size() % 2 != 0) {
            pairedTeams.add("Bay");
        }

        int matchesPerRound = pairedTeams.size() / 2;
        int totalRounds = pairedTeams.size() - 1;

        for (int i = 0; i < totalRounds; i++) {

            String home, away;
            for (int j = 0; j < matchesPerRound; j++) {
                home = pairedTeams.get(j);
                away = pairedTeams.get(pairedTeams.size() - j - 1);
                firstFixture.add(home + " vs " + away);
                secondFixture.add(away + " vs " + home);
            }

            Collections.rotate(pairedTeams.subList(1, pairedTeams.size()), 1);
        }


        fixture.addAll(firstFixture);
        fixture.addAll(secondFixture);

        return fixture;
    }

    public void printFixtures() {
        int matchesPerRound = teams.size() / 2;
        if (teams.size() % 2 != 0) matchesPerRound++;

        List<String> fixtures = new ArrayList<>();
        fixtures.addAll(firstFixture);
        fixtures.addAll(secondFixture);

        for (int i = 0; i < fixtures.size(); i++) {
            if (i % matchesPerRound == 0) {
                System.out.println("\nRound " + (i / 3 + 1));
            }
            System.out.println(fixtures.get(i));
        }
    }
}
