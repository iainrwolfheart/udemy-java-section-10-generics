import java.util.ArrayList;
import java.util.Collections;

public abstract class Team<P extends Player> implements Comparable<Team> {

    private String name;
    private ArrayList<P> squad;
    private int gamesPlayed;
    private int points;
    private int wins;
    private int ties;

    public Team(String name) {
        this.name = name;
        this.squad = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<P> getSquad() {
        return squad;
    }

    public void setSquad(ArrayList<P> squad) {
        this.squad = squad;
    }

    public void signPlayer(P player) {
        if (this.squad.contains(player)) {
            System.out.println(player.getName() + " is already on the roster");
        } else {
            this.squad.add(player);
        }
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points += points;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getWins() {
        return wins;
    }

    public void winsGame() {
        this.wins++;
        this.gamesPlayed++;
    }

    public int getTies() {
        return ties;
    }

    public void tiesGame() {
        this.ties++;
        this.gamesPlayed++;
        this.points++;
    }

    public int getLosses() {
        return this.gamesPlayed - this.wins - this.ties;
    }

    public void losesGame() {
        this.gamesPlayed++;
    }

    public int compareTo(Team team) {
        if (this.points > team.getPoints()) {
            return -1;
        } else if (this.points < team.getPoints()) {
            return 1;
        } else {
            return 0;
        }
    }

    public void showRoster() {
        Collections.sort(squad);
        for (P player : squad) {
            System.out.println(player.getName() + ", " + player.getRating());
        }
    }
}
