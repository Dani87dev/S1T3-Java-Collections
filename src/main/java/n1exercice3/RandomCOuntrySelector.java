package n1exercice3;

import java.util.ArrayList;
import java.util.List;

public class RandomCountrySelector {

    private List<Country> countryList;
    private List<Country> usedCountries;

    public RandomCountrySelector(List<Country> list) {
        this.countryList = list;
        this.usedCountries = new ArrayList<>();
    }

    public Country randomSelection() {
        Country selectedCountry;

        do {
            int numberRandom = (int) (Math.random() * countryList.size());
            selectedCountry = countryList.get(numberRandom);

        } while (usedCountries.contains(selectedCountry));
        usedCountries.add(selectedCountry);

        return selectedCountry;
    }


}
