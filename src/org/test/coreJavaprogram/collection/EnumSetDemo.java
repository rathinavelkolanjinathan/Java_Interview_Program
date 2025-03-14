package org.test.coreJavaprogram.collection;

import java.util.EnumSet;

public class EnumSetDemo {
    public static void main(String[] args) {
        //Cretaing enum set
        EnumSet<Days> weeksDays = EnumSet.range(Days.MONDAY,Days.FRIDAY);
        //System.out.print("Weeks Days..."+weeksDays);

        //adding element
        weeksDays.add(Days.SUNDAY);


        // removing element
        weeksDays.remove(Days.MONDAY);
        System.out.print("updatesSet"+weeksDays);
    }
}
