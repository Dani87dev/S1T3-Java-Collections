package n1exercice1;

import java.util.ArrayList;
import java.util.List;


public class MonthManager {

    private List<Month> calendar = new ArrayList<>();

    public List<Month> getCalendar() {
        return calendar;
    }


    public void createCalendar() {

        Month january = new Month("January");
        Month february = new Month("February");
        Month march = new Month("March");
        Month april = new Month("April");
        Month may = new Month("May");
        Month june = new Month("June");
        Month july = new Month("July");
        Month september = new Month("September");
        Month october = new Month("October");
        Month november = new Month("November");
        Month december = new Month("December");

        calendar.add(january);
        calendar.add(february);
        calendar.add(march);
        calendar.add(april);
        calendar.add(may);
        calendar.add(june);
        calendar.add(july);
        calendar.add(september);
        calendar.add(october);
        calendar.add(november);
        calendar.add(december);
    }

    public void addOneMonth(String name, int position) {
        Month month = new Month(name);
        calendar.add(position, month);
    }


}






