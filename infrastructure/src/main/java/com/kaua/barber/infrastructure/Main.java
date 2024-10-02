package com.kaua.barber.infrastructure;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        aa();
    }

    public static void aa() throws InterruptedException {
        Thread.ofVirtual().name("barber").start(() -> {
            System.out.println("Hello barber!");
        }).join();
    }
}