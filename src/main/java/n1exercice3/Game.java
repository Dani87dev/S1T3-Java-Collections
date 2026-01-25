package n1exercice3;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static final int NUM_ROUNDS = 10;

    private Player player1;
    private List<Country> listCountries;
    private RandomCountrySelector countrySelector;
    private List<GameRound> rounds;
    private ConsoleView view;

    public Game(Player player1, List<Country> listCountries, ConsoleView view){
        this.player1 = player1;
        this.countrySelector = new RandomCountrySelector(listCountries);
        this.rounds = new ArrayList<>();
        this.view = view;
    }

    public void play() {
        while (rounds.size() < NUM_ROUNDS) {

            Country country = countrySelector.randomSelection();
            String answer = view.askCountry(country);

            GameRound round = new GameRound(country, answer);
            if (round.isCorrect()) {
                player1.incrementScore();
            }

            rounds.add(round);
        }
    }

}