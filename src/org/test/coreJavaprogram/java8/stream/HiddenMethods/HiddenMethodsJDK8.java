package org.test.coreJavaprogram.java8.stream.HiddenMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 1.Stream.ofnullable
 * 2.Stream.iterate
 * 3.collectors.collectingAndThen
 * 4.collectors.teeing
 * 5.stream.takewhile and stream.dropwhile
 * 6.stream.concat
 * 7.collectors.partioningby
 * 8.InstreamforRanges
 */
public class HiddenMethodsJDK8 {

    public static void main(String[] args) {
        //1.OfNullable

        List<String> name = Arrays.asList("kolanji", null, "priya", null, "amirtha");
        List<String> nonNull = name.stream()
                .flatMap(Stream::ofNullable)
                .collect(Collectors.toList());
        System.out.println("OfNullable.... " + nonNull);

        //2.Iterate

        Stream.iterate(1, n -> n + 2).limit(5).forEach(System.out::println);

        //3.collectingAndThen

        List<Employee> emp = Arrays.asList(new Employee(5000, "Kolanji"),
                new Employee(7000, "Rathna"),
                new Employee(9000, "Vel"),
                new Employee(2000, "priya"), new Employee(3000, "amirtha"));

        Long emp1 = emp.stream()
                .mapToDouble(Employee::getSalary)
                .boxed()
                .collect(Collectors.collectingAndThen
                        (Collectors.averagingDouble(Double::doubleValue), Math::round));

        System.out.println("Collect and then..." + emp1);
        //4.Takewhile and dropwhile

        List<Integer> number = List.of(1, 2, 3, 4, 5, 6, 7);

        List<Integer> takewhil = number
                .stream()
                .takeWhile(num -> num < 5)
                .collect(Collectors.toList());
        System.out.println("Take While Test..." + takewhil);

        List<Integer> dropwhile = number
                .stream()
                .dropWhile(num -> num < 5)
                .collect(Collectors.toList());
        System.out.println("Drop While...." + dropwhile);

        List<Integer> dropwhiletake = number
                .stream()
                .dropWhile(num -> num < 3)
                .takeWhile(num -> num < 7)
                .collect(Collectors.toList());
        System.out.println("Drop WhileTake...." + dropwhiletake);

        //5.Teeing

        Map<String, Integer> teeing = number.stream()
                .collect(Collectors.teeing(
                        Collectors.maxBy(Integer::compareTo),
                        Collectors.minBy(Integer::compareTo),
                        (e1, e2) ->
                                Map.of("Max", e1.get(), "min", e2.get())));
        System.out.println("Teeing...." + teeing);

        //6.Concatnate
        Stream<Integer> s1 = Stream.of(1, 2, 3);
        Stream<Integer> s2 = Stream.of(4, 5, 6);
        Stream<Integer> concat = Stream.concat(s1, s2);

        System.out.println("Concat.." + concat);

        long sum = concat.mapToInt(Integer::intValue).sum();
        System.out.println("Sum..." + sum);
        //7.PartioningBy

        Map<Boolean, List<Integer>> map = number.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println("OddNumber..." + map.get(Boolean.FALSE));
        System.out.println("Even Number..." + map.get(Boolean.TRUE));

        //8.ForRange
        List<Integer> range = IntStream.range(1, 100).boxed().collect(Collectors.toList());
        System.out.println("Range" + range);

        List<Integer> rangeclosed = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());
        System.out.println("RangeClosed..." + rangeclosed);

        //N copies

       List<String> copy =  Collections.nCopies(5,"Kolanji");
       System.out.println(copy);
       try{

           copy.set(0,"Hai");
       }catch(UnsupportedOperationException ex) {
           System.out.println("Lis is immutable  it cant be modify");

       }


    }
}
