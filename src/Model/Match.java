package Model;

import java.time.LocalTime;

public class Match {

    private LocalTime time;
    private Team team1;
    private Team team2;
    private int id;
    private String result;
    private String type;
    private int[] score;
    private static int matchCount = 1;



    public Match(LocalTime time, Team team1, Team team2) {

        this.time = time;
        this.team1 = team1;
        this.team2 = team2;
        this.id = matchCount;
        matchCount++;
    }

    //Constuctoer
    public void setResult(String result) {
            this.result = result;
    }

    public LocalTime getTime() {
        return time;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public int getId() {
        return id;
    }

    public String getResult() {
        return result;
    }

    public String getType() {
        return type;
    }

    public int[] getScore() {
        return score;
    }

    public static int getMatchCount() {
        return matchCount;
    }
}
