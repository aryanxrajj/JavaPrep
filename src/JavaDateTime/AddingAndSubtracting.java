package JavaDateTime;

import java.time.*;

public class AddingAndSubtracting {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate nextWeek = date.plusWeeks(1);
        LocalDate previous = date.minusMonths(1);
        System.out.println(date);
        System.out.println(nextWeek);
        System.out.println(previous);
    }
}
