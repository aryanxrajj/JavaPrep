package JavaDateTime;

import java.time.*;

public class Introduction {
    public static void main(String[] args) {
        LocalDate currentdate = LocalDate.now();
        System.out.println(currentdate);
        LocalTime currenttime = LocalTime.now();
        System.out.println(currenttime);
        LocalDateTime currentdatetime = LocalDateTime.now();
        System.out.println(currentdatetime);
    }
}
