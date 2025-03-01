package org.test.coreJavaprogram.java8.prdicate;

import org.test.coreJavaprogram.java8.lamdaexpression.EmployeePredicates;

import java.util.ArrayList;
import java.util.Arrays;

public class PredicateLaunch {
    public static void main(String[] args) {
        PrdicateTest e1 = new PrdicateTest(1, 23, "M", "Rick", "Beethovan");
        PrdicateTest e2 = new PrdicateTest(2, 13, "F", "Martina", "Hengis");
        PrdicateTest e3 = new PrdicateTest(3, 43, "M", "Ricky", "Martin");
        PrdicateTest e4 = new PrdicateTest(4, 26, "M", "Jon", "Lowman");
        PrdicateTest e5 = new PrdicateTest(5, 19, "F", "Cristine", "Maria");
        PrdicateTest e6 = new PrdicateTest(6, 15, "M", "David", "Feezor");
        PrdicateTest e7 = new PrdicateTest(7, 68, "F", "Melissa", "Roy");
        PrdicateTest e8 = new PrdicateTest(8, 79, "M", "Alex", "Gussin");
        PrdicateTest e9 = new PrdicateTest(9, 15, "F", "Neetu", "Singh");
        PrdicateTest e10 = new PrdicateTest(10, 45, "M", "Naveen", "Jain");
        ArrayList<PrdicateTest> list = new ArrayList();
        list.addAll(Arrays.asList(new PrdicateTest[]{e1, e2, e3, e4, e5, e6, e7, e8, e9, e10}));
        org.test.coreJavaprogram.java8.lamdaexpression.EmployeePredicates l = new EmployeePredicates();
        System.out.println((l.filterEmployees(list, l.isMale())));


    }
}
