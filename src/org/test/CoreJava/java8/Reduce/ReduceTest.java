package org.test.CoreJava.java8.Reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceTest {

    public static void main(String[] args) {
        Book book = new Book("coreJava", 250, 300, 3);
        Book book1 = new Book("oracle", 400, 30, 2);
        Book book2 = new Book("j2ee", 250d, 3, 4);
        Book book3 = new Book("Navel", 250d, 30, 5);

		List<Book> list = new ArrayList();
        list.add(book);
        list.add(book1);
        list.add(book2);
        list.add(book3);
        System.out.println(list);


        //Long ll=(Long) list.stream().collect(Collectors.counting());
        int ll = (int) list.stream().collect(Collectors.summingInt((nb) -> nb.nbook));
        System.out.println(ll);

        Double d = (Double) list.stream().collect(Collectors.summingDouble((nb) -> nb.bprice));
        System.out.println(d);


    }
}
