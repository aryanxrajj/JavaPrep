package JavaDateTime;

import java.time.LocalDate;
import java.time.Period;

public class period {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate birth = LocalDate.of(2003,12,15);
        Period p = Period.between(birth,date);
        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());

        LocalDate plus = date.plusMonths(4);
        System.out.println(plus);
    }
}
