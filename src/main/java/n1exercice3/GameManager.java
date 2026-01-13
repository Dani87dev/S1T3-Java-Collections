package n1exercice3;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GameManager {

    private Map<String, String> countries = new HashMap<>();


    private void loadCountries() {

        try {
            BufferedReader document = new BufferedReader(
                    new InputStreamReader(getClass().getClassLoader().getResourceAsStream("countries.txt"))
            );

            String line;
            while ((line = document.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty()) {
                    continue;
                }

                String[] documentParts = line.split("\\s+");
                String countryPart = documentParts[0];
                String capitalPart = documentParts[1];

                countries.put(countryPart, capitalPart);
            }

        } catch (Exception e) {
            System.out.println("Error reading file");
        }

    }

    public void play() {
        int score = 0;
        String playerName = "";
        loadCountries();
        List<String> countryList = countryList();
        List<String> selectedCountries = randomSelection(countryList);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter your name: ");
        playerName = scanner.nextLine();

        for (String country : selectedCountries) {
            System.out.print("Please, write the capital of " + country + ": ");
            String answer = scanner.nextLine();

            String correctCapital = countries.get(country);

            if (answer.equalsIgnoreCase(correctCapital)) {
                score++;
            }
        }
        System.out.println("Score of " + playerName + ": " + score + "points");

        try (FileWriter createDoc = new FileWriter("data/classificacio.txt", true)) {
            createDoc.write(playerName + " - " + score + System.lineSeparator());
        } catch (IOException e) {
            System.out.println("Error writing file");
        }

        scanner.close();

    }

    private List<String> countryList() {
        return new ArrayList<>(countries.keySet());
    }

    private List<String> randomSelection(List<String> countryList) {
        List<String> selectedCountries = new ArrayList<>();

        while (selectedCountries.size() < 10) {
            int index = (int) (Math.random() * countryList.size());
            String country = countryList.get(index);

            if (!selectedCountries.contains(country)) {
                selectedCountries.add(country);
            }
        }

        return selectedCountries;
    }


}
