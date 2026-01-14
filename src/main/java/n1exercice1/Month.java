package n1exercice1;

public class Month {

    private final String NAME;

    public Month(String name) {
        this.NAME = name;
    }

    public String getName() {
        return this.NAME;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Month month = (Month) obj;
        return this.NAME.equals(month.NAME);
    }

    @Override
    public int hashCode() {
        return this.NAME.hashCode();
    }

    @Override
    public String toString() {
        return this.NAME;
    }
}
