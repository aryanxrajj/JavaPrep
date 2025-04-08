package JavaDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormattingAndParsingDates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        //Converting Date And Time to String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);

        //Parsing a date String
        LocalDate parsedDate = LocalDate.parse(formattedDate, formatter);
        System.out.println(parsedDate);
    }
}
