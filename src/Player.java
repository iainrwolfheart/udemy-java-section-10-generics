public class Player implements Comparable<Player>{

    private String name;
    private int rating;

    public Player(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public int compareTo(Player player) {
        if (this.rating > player.getRating()) {
            return -1;
        } else if (this.rating < player.getRating()) {
            return 1;
        } else {
            return 0;
        }
    }
}
