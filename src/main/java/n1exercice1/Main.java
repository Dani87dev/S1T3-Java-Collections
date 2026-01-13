package n1exercice1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {

        MonthManager monthManager = new MonthManager();
        monthManager.createCalendar();
        printCalendar(monthManager.getCalendar());
        System.out.println();


        monthManager.addOneMonth("August", 7);
        printCalendar(monthManager.getCalendar());
        System.out.println();


        HashSet<Month> monthSet = new HashSet<>(monthManager.getCalendar());

        System.out.println("Size of monthSet is about " + monthSet.size());
        monthSet.add(new Month("August"));
        monthSet.add(new Month("January"));
        System.out.println("Size of monthSet is about " + monthSet.size());
        System.out.println();


        Iterator<Month> iterator = monthSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

    public static void printCalendar(Collection<Month> calendar) {
        for (Month month : calendar) {
            System.out.println(month);
        }
    }


}
