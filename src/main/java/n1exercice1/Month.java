package n1exercice1;

public class Month {

    private String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
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
        return this.name.equals(month.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
