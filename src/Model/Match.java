package Model;

import jdk.jshell.execution.LoaderDelegate;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Arrays;

public class Match {

    private LocalTime time;
    private Team team1;
    private Team team2;
    private int id;
    private String result;
    private String type;
    private int[] score;
    private static int matchCount = 0;


// LocalTime time, Team team1, Team team2
    public Match() {
//        this.time = time;
//        this.team1 = team1;
//        this.team2 = team2;
        matchCount++;
        this.id = matchCount;
    }

    @Override
    public String toString() {
        return "Match#" + id +
                " time:" + time +
                " " + team1.getName() +
                " vs " + team2.getName();
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setTeams(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setScore(int[] score) {
        this.score = score;
    }

    public static void setMatchCount(int matchCount) {
        Match.matchCount = matchCount;
    }

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
