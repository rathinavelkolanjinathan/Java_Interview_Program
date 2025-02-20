# Java_Interview_Program

feature-dev
[README.md](README.md)

JDK17 Feature  Ref: https://copilot.microsoft.com/chats/6SyS99mZWR6gjQEP3rAXZ
------------------------
1.Pattern Matching For Switch Statements
2.Pattern Matching for instanceof
3.Sealed Classes & Interfaces
4.Enhanced Pseudo-Random Number Generators
5.Restore Always-Strict Floating-Point Semantics
6.Strongly Encapsulate JDK Internals
7.New macOS Rendering Pipeline
8.Deprecate the Applet API for Removal

Main Feature
1.Sealed Classes (JEP 409)
2.Pattern Matching for instanceof (JEP 394)
3.Records (JEP 395)
4.Enhanced Pseudo-Random Number Generators (JEP 356)

// Older
public static String getDayOfWeek(int dayNum) {
String day;
switch (dayNum) {
case 1:
day = "Monday";
break;
case 2:
day = "Tuesday";
break;
case 3:
day = "Wednesday";
break;
case 4:
day = "Thursday";
break;
case 5:
day = "Friday";
break;
case 6:
day = "Saturday";
break;
case 7:
day = "Sunday";
break;
default:
day = "Invalid day";
}
return day;
}

#Java 12
public static String getDayOfWeek(int dayNum) {
return switch (dayNum) {
case 1 -> "Monday";
case 2 -> "Tuesday";
case 3 -> "Wednesday";
case 4 -> "Thursday";
case 5 -> "Friday";
case 6 -> "Saturday";
case 7 -> "Sunday";
default -> "Invalid day";
};
}

