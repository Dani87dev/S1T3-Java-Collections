package n1exercice3;

public class GameRound {

    private Country country;
    private boolean correct;

    public GameRound(Country country, String answer) {
        this.country = country;
        this.correct = answer.equalsIgnoreCase(country.getCapital());
    }

    public boolean isCorrect() {
        return correct;
    }

}
