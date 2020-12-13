public class RugbyTeam extends Team {

    public RugbyTeam(String name) {
        super(name);
    }

    @Override
    public void winsGame() {
        super.winsGame();
        super.setPoints(2);
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
