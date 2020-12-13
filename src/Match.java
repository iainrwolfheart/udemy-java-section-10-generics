public class Match<Team> {

    private Team homeTeam;
    private int homeGoals;
    private Team awayTeam;
    private int awayGoals;

    public Match(Team homeTeam, int homeGoals, Team awayTeam, int awayGoals) {
        this.homeTeam = homeTeam;
        this.homeGoals = homeGoals;
        this.awayTeam = awayTeam;
        this.awayGoals = awayGoals;
    }

}
