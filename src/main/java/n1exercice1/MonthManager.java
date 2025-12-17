package n1exercice1;

import java.util.ArrayList;



public class MonthManager {

    static ArrayList<Month> calendar = new ArrayList<Month>();

    public void createCalendar() {

        Month January = new Month("January-coladepescao");
        Month February = new Month("February");
        Month March = new Month("March");
        Month April = new Month("April");
        Month May = new Month("May");
        Month June = new Month("June");
        Month July = new Month("July");
        Month September = new Month("September");
        Month October = new Month("October");
        Month November = new Month("November");
        Month December = new Month("December");

        calendar.add(January);
        calendar.add(February);
        calendar.add(March);
        calendar.add(April);
        calendar.add(May);
        calendar.add(June);
        calendar.add(July);
        calendar.add(September);
        calendar.add(October);
        calendar.add(November);
        calendar.add(December);
    }
}






