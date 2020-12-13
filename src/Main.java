public class Main {

    public static void main(String[] args) {

//        Create a generic League class <T>
//        When instantiating a League object, declare Teams type
//        e.g. League premLeague = new League<FootballTeam>
//        Add fields to store list of teams
//        Include method to add teams, and showLeagueTable() to
//        print teams in order of points. Use Collections.sort()?

//        Create an abstract Team class and then football
//        and rugby classes that extend it
//        Add fields for games played, won etc
//        Add methods to calculate points (won*3 + tied etc)
//        make these methods abstract in Team class and override

        League<FootballTeam> premierLeague = new League("Premier League");
        RugbyTeam harlequins = new RugbyTeam("Harlequins");
        FootballTeam manU = new FootballTeam("Manchester United");
        FootballTeam spurs = new FootballTeam("Tottenham Hotspur");
        FootballTeam gunners = new FootballTeam("Arsenal");

//        Only using broad Player type, but you get the idea
        manU.signPlayer(new Player("Peter Schmichael", 96));
        manU.signPlayer(new Player("David Beckham", 92));
        manU.signPlayer(new Player("Denis Irwin", 86));
        manU.signPlayer(new Player("Ryan Giggs", 97));

//        premierLeague.addTeam(harlequins); //Doesn't work, yay! Go, Generics!
        premierLeague.addTeam(manU);
        premierLeague.addTeam(spurs);
        premierLeague.addTeam(gunners);

        manU.winsGame();
        manU.winsGame();
        manU.tiesGame();
        manU.losesGame();
        spurs.winsGame();
        spurs.losesGame();
        spurs.tiesGame();
        spurs.tiesGame();
        gunners.winsGame();
        gunners.winsGame();
        gunners.losesGame();

//        Demonstrating implementation of the Comparable interface (see League and Team classes)
        premierLeague.showLeagueTable();
        manU.showRoster();
    }
}
