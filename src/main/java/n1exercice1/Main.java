package n1exercice1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import static n1exercice1.MonthManager.calendar;


public class Main {

    public static void main (String[] args) {

        //tryArrayList();
        //convertArrayListToHashSet();
        //iterateWithFor();
        iterateWithIterator();

    }

    static public void tryArrayList() {

        MonthManager gestor = new MonthManager();
        gestor.createCalendar();
        System.out.println(calendar);

        Month august = new Month("August");
        calendar.add(7, august);
        System.out.println(calendar);
    }

    //canviar el metodo para que reciba el arraylist como parametro y devuelva el HashSet
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

    // escoger solo un for
    static void iterateWithFor() {

        MonthManager gestor3 = new MonthManager();
        gestor3.createCalendar();

        System.out.println("Iterating over a collection with a classic for loop");
        for(int i =0; i<calendar.size(); i++) {
            System.out.println(calendar.get(i));
        }

        System.out.println("Iterating over a collection with a for each loop");
        for(Month element: calendar) {
            System.out.println(element);
        }
    }

    static void iterateWithIterator() {

        MonthManager gestor4 = new MonthManager();
        gestor4.createCalendar();
        Iterator<Month> iteradorDani = calendar.iterator();
        /*nomes imprimeix el primer
        System.out.println(iteradorDani.next());
        */
        while(iteradorDani.hasNext()) {
            System.out.println(iteradorDani.next());
        }
    }

}
