package n1exercice3;

public class Player {

    private String name = "";
    private int score = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        this.score += 1;
    }


    @Override
    public String toString() {
        return this.name + " " + this.score + " points";
    }
}
