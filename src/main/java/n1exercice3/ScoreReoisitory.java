package n1exercice3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ScoreRepository {

    public void saveScorePlayer(Player player) {

        try (PrintWriter writer = new PrintWriter(new FileWriter("src/scores.txt"), true)) {
            writer.println(player.getName() + ": " + player.getScore());
        } catch (IOException e) {
            System.out.println("An error occurred while attempting to modify the score player");
        }

    }

}
