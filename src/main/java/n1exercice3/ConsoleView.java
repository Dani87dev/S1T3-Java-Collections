package n1exercice3;

import java.util.Scanner;

public class ConsoleView {

    private Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public String askName() {
        System.out.println("Insert your name:");
        return scanner.nextLine();
    }

    public String askCountry(Country country) {
        System.out.println("What is the capital of " + country.getName() + " ?");
        return scanner.nextLine();
    }
}