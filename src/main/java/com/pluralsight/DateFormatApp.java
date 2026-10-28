package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatApp {
    public static void main(String[] args) {

        LocalDate dateRightNow = LocalDate.now(); //gets the date
        LocalDateTime dateTimeRightNow = LocalDateTime.now(); //gets the time and the date together.

        //sout the dates
        System.out.println(dateTimeRightNow.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        System.out.println(dateRightNow);
        System.out.println(dateTimeRightNow.format(DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy")));
        System.out.println(dateTimeRightNow.format(DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy hh:mm")));
    }
}
