package Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Team {

    private String name;
    private int id;
    private static int nextId = 1;
    private int[] points;
    private int score;
    private String position;
    private ArrayList<Player> players = new ArrayList<Player>();
    String attacker;
    String defender;


    public Team(String teamname, String [] memberNames) {
        this.name = teamname;
        attacker = memberNames[0];
        defender = memberNames[1];
        this.id = nextId;
        nextId++;

        for (String s:memberNames) {
            this.addPlayer(s);
        }
        // Only print out in 'Main'
        // System.out.println(this);
    }

    protected void addPlayer(String name) {
        Player p = new Player(name,"",0);
        players.add(p);
    }

/*
    // Default toString method
    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", points=" + Arrays.toString(points) +
                ", score=" + score +
                ", position='" + position + '\'' +
                ", players=" + players +
                ", attacker='" + attacker + '\'' +
                ", defender='" + defender + '\'' +
                '}';
    }
 */
    // Tess
    public String toString() {
        String str = this.name + " players: " + this.players;
        return str;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public int[] getPoints() {
        return points;
    }

    public int getScore() {
        return score;
    }

    public String getPosition() {
        return position;
    }
}
