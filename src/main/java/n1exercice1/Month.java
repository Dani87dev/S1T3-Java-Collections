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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Month month = (Month) o;
        return name.equals(month.name);
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
