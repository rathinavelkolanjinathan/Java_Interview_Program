package org.java.reactiveprogram;

import reactor.core.publisher.Mono;

public class ExtractDataFromMono {
    public static void main(String[] args) throws InterruptedException {
        //Nonblocking
        Mono.just("data")
                .subscribe(System.out::println);
        //Block method
        String dataFromMono = (String) getMono()
                .block();
        System.out.println("Data from Mono: " + dataFromMono);
    }

    public static Mono getMono() throws InterruptedException {
        return Mono.fromSupplier(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello";
        });

    }

}
