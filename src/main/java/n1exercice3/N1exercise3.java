package n1exercice3;

public class N1exercise3 {

    public static void main(String[] args) {


        CountryLoader loader = new CountryLoader();
        ConsoleView  console = new ConsoleView();

        String playerName = console.askName();
        Player player = new Player(playerName);

        Game game = new Game(player, loader.getCountriesAsList(), console);
        game.startGame();

        ScoreRepository repository = new ScoreRepository();
        repository.saveScorePlayer(player);

        System.out.println("Finish! Your total score is " + player.getScore() + ". Your score has been saved in .txt file");
    }

}
