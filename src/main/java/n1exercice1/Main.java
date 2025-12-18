package n1exercice1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import static n1exercice1.MonthManager.calendar;


public class Main {

    public static void main (String[] args) {

        tryArrayList();
        convertArrayListToHashSet();

    }

    static public void tryArrayList() {

        MonthManager gestor = new MonthManager();
        gestor.createCalendar();
        System.out.println(calendar);

        Month august = new Month("August");
        calendar.add(7, august);
        System.out.println(calendar);
    }

    static public void convertArrayListToHashSet() {

        MonthManager gestor2 = new MonthManager();
        gestor2.createCalendar();
        Month december2 = new Month("December2");
        calendar.add(11, december2);
        calendar.add(11, december2);


        System.out.println(calendar);
        HashSet<Month> myHashSet = new HashSet<Month>(calendar);
        System.out.println(myHashSet);

    }

}
