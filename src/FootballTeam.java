public class FootballTeam extends Team {

    public FootballTeam(String name) {
        super(name);
    }

    @Override
    public void winsGame() {
        super.winsGame();
        super.setPoints(3);
    }

    @Override
    public int compareTo(Team team) {
        if (super.getPoints() > team.getPoints()) {
            return -1;
        } else if (this.getPoints() < team.getPoints()) {
            return 1;
        } else {
            return 0;
        }
    }
}
