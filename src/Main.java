import Model.*;

import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Team> teams = new ArrayList<Team>();
    private static ArrayList<Match> matches = new ArrayList<Match>();


    public static void main(String[] args) {

        Team team1 = registerTeam("Golden Eagels", new String[]{"Jens", "Gustav"});
        Team team2 = registerTeam("Frozen pinguins", new String[]{"Mogens", "Peter"});
        Team team3 = registerTeam("Swinging Monkies", new String[]{"Matthias", "Ali"});
        Team team4 = registerTeam("Crawling Antz", new String[]{"Ditte", "Murat"});
        Team team5 = registerTeam("Bad Boyz", new String[]{"Andreas", "Jakob"});
        Team team6 = registerTeam("Sizzy boys", new String[]{"Mattias", "Robert"});
        Team team7 = registerTeam("Incoming", new String[]{"Natasja", "Nicolai"});
        Team team8 = registerTeam("Incoming", new String[]{"x", "Y"});

/*
        Match match1 = new Match();
        match1.setTime(LocalTime.of(10,55));
        match1.setTeams(team1, team2);

 */
        // displayTeams();

        // Create a new Match, set a time - by ID
       int mid1 = scheduleMatch(LocalTime.of(10,00));
       updateMatch(mid1, team1, team2);
       int mid2 = scheduleMatch(LocalTime.of(10,00));
       updateMatch(mid2, team3, team4);

       System.out.println(getMatchById(mid1));

    }
    public static void updateMatch(int matchID, Team team1, Team team2) {
        Match m1 = getMatchById(matchID);
        m1.setTeams(team1, team2);
    }

    // Create new Match
    private static Match getMatchById(int matchId) {
        Match foundMatch = null;
        for (Match m1:matches) {
            if (m1.getId() == matchId) {
                foundMatch = m1;
                break;
            }
        }
        return foundMatch;
    }

    //
    private static Team registerTeam(String teamName, String[] teamMembers) {
        Team team = new Team(teamName, teamMembers);
        teams.add(team);
        return team;
    }

    // Create new Match object/instance, with time, add to ArrayList and return a Match ID.
    private static int scheduleMatch(LocalTime time) {
        Match m = new Match();
        m.setTime(time);
        matches.add(m);
        return m.getId();
    }

    public static void printTeam(Team team) {
        System.out.println(team);
    }

    public static void displayTeams() {
        for (Team t : teams) {
            System.out.println(t);
        }
    }

    public static void displayMatches() {
        for (Match m : matches) {
            System.out.println(m);
        }
    }
}
