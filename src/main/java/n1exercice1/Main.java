package n1exercice1;

import static n1exercice1.MonthManager.calendar;

public class Main {

    public static void main (String[] args) {

        tryArrayList();

    }

    static public void tryArrayList() {

        MonthManager gestor = new MonthManager();
        gestor.createCalendar();
        System.out.println(calendar);

        Month august = new Month("August");
        calendar.add(7, august);
        System.out.println(calendar);


    }

}
