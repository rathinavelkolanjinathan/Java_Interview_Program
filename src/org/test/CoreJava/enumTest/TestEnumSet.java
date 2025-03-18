package org.test.CoreJava.enumTest;

import java.util.EnumSet;

public class TestEnumSet {

    //All Enum Constants:
    EnumSet<Day> allDays = EnumSet.allOf(Day.class);
    //No Enum Constants:
    EnumSet<Day> noDays = EnumSet.noneOf(Day.class);
    //Specific Enum Constants:
    EnumSet<Day> weekdays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY);

    //Range of Enum Constants:
    EnumSet<Day> workdays = EnumSet.range(Day.MONDAY, Day.FRIDAY);

    //basic operation
    EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);

     // System.out.println(weekend.contains(Day.SATURDAY)); // true
         //weekend.add(Day.MONDAY);

    public static void main(String[] args) {
        // Creating an EnumSet for weekdays
        EnumSet<Day> weekdays = EnumSet.range(Day.MONDAY, Day.FRIDAY);

        System.out.println("Weekdays: " + weekdays);

        // Adding elements
        weekdays.add(Day.SUNDAY); // EnumSet allows modification
        System.out.println("Updated Set: " + weekdays);

        // Removing elements
        weekdays.remove(Day.SUNDAY);
        System.out.println("After removal: " + weekdays);
    }
}
