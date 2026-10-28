package com.pluralsight;


import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormatApp {
    public static void main(String[] args) {

        LocalDate dateRightNow = LocalDate.now(); //gets the date

        System.out.println(dateRightNow.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        System.out.println(dateRightNow);



    }
}
