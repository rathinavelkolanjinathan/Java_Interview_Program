# Java Versioning details

# Generate dummy xml or csv file https://www.mockaroo.com/

JDK17 Feature
Ref: https://copilot.microsoft.com/chats/6SyS99mZWR6gjQEP3rAXZ

https://javatechonline.com/java-17-features/

https://www.crsinfosolutions.com/scenario-based-java-interview-questions/

| JDK VERSION 17 | Feature |
|----------------|:--------|
| 1              | Pattern Matching For Switch Statements        |
| 2              | Pattern Matching for instanceof        |
| 3              | Enhanced Pseudo-Random Number Generators                                       |
| 4              | Restore Always-Strict Floating-Point Semantics                                       |
| 5              | Strongly Encapsulate JDK Internals                                       |
| 6              | New macOS Rendering Pipeline                                       |
| 7              | Deprecate the Applet API for Removal                                                                   |

Main Feature
---------------
| JKD17 | Fetaure |
|-------|:--------|
| 1     | Sealed Classes (JEP 409)        |
| 2     | Pattern Matching for instanceof (JEP 394)        |
| 3     | Records (JEP 395)        |
| 4     | Enhanced Pseudo-Random Number Generators (JEP 356)                         |

   
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


# Garbage collections Type

| S.No | Garbage CoolectorType | Feature                                        |
|:-----|:----------------------|------------------------------------------------|
| 1.   | Serial Garbage Collector                      | single thread                                  |
| 2.   | Parallel Garbage Collector                      | Multiple thread garbage collections            |
| 3.   | Concurrent Mark Sweep Garbage Collector(CMS)                      |    scan heap memory and mark instance for evict and then sweep marked instance                                            |
| 4.   | Garbage First(G1) in jdk7                      |  large heap memory areas splitted many region                                              |
| 5.   | ZGC(Z Garbage collector) In jdk15                      |  Without stopping the execution of application free the heap                                              |
| 6.   | Shenandoah Garbage collector (In Jdk12)                                                       | Reduce the pass times                          |

# Remove Objects from the catch algorithm
1.Least Frequently used (LFU)

2.Least Recently used(LRU)

3.Most Recently used(MRU)

4.First In First Out(FIFO)

5.Last Access Time

6.Object Size

# JDK21 Feature
1.Record Patterns (JEP 440)
2.Pattern Matching for switch (JEP 441)
3.Virtual Threads (Project Loom)
4.Sequenced Collections

Feature	Java 21 (Record Patterns)	Java 20 and Earlier
Destructuring	Directly deconstruct record components	Requires explicit calls to accessor methods
Pattern Matching in Switch	Supports record patterns	Not supported
Nested Matching	Fully supported	Not supported
Boilerplate Code	Significantly reduced	More verbose