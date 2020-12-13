import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
//    This means that 'T' can be of any type as long as
//    that type extends Team. 'T' can be called anything, but 'T' is conventional
//    When a new object is instantiated and the type declared, this is what that relates to.
//    I totes get it now.

    private String name;
    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<T>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<T> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<T> teams) {
        this.teams = teams;
    }

    public void addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team + " is already in this league");
        } else {
            this.teams.add(team);
        }
    }

    public void showLeagueTable() {
        Collections.sort(teams);
        int position = 1;
        for (T team : teams) {
            System.out.println(position++ + ". " + team.getName() + " - " +
                    team.getPoints() + " points");
        }
    }

//    Relegation method??
}
