package n1exercice3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountryLoader {
    private Map<String, String> countryMap;

    public CountryLoader() {
        this.countryMap = new HashMap<>();
        loadCountries();
    }

    private void loadCountries() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/countries.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2) {
                    countryMap.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading countries.txt: " + e.getMessage());
        }
    }

    public List<Country> getCountriesAsList() {
        List<Country> countries = new ArrayList<>();
        for (Map.Entry<String, String> entry : countryMap.entrySet()) {
            countries.add(new Country(entry.getKey(), entry.getValue()));
        }
        return countries;
    }

    public Map<String, String> getCountryMap() {
        return countryMap;
    }
}