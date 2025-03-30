package JavaDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormattingAndParsingDates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);

        //Parsing a date String
        LocalDate parsedDate = LocalDate.parse("29-03-2025", formatter);
        System.out.println(parsedDate);
    }
}
