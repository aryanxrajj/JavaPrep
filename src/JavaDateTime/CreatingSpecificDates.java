package JavaDateTime;

import java.time.*;

public class CreatingSpecificDates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2004,6,14);
        System.out.println(date);
        LocalTime time = LocalTime.of(18,12,10);
        System.out.println(time);
    }
}
