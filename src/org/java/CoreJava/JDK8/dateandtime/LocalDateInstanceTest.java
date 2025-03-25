package org.java.CoreJava.JDK8.dateandtime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateInstanceTest {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2021, 6, 1);
        LocalDate endDate = LocalDate.of(2024, 6, 19);
        System.out.println("startDate" + startDate);
        System.out.println("endDate" + endDate);

        // Period between

        Period pp = Period.between(startDate, endDate);
        int year = pp.getYears();
        int month = pp.getMonths();
        int date = pp.getDays();
        System.out.println("Difference" + "year::" + year + "month::" + month + "date::" + date);

        //Like hours and Minute

        LocalDateTime startDateTime = LocalDateTime.of(2021, 6, 1, 10, 3);
        LocalDateTime endDateTime = LocalDateTime.of(2024, 6, 1, 10, 3);
        Duration duration = Duration.between(startDateTime, endDateTime);
        long hours = duration.toHours();
        System.out.print("hours" + hours);

    }
}
