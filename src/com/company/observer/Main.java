package com.company.observer;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        // publisher -> Subject
        //subscriber -> Observer
        FileReader fileReader = new FileReader();

        Observer observer1 = new TypeOneObserver(); //reading news
        Observer observer2 = new TypeOneObserver(); //reading news
        Observer observer3 = new TypeTwoObserver(); //wrap food

        Subject subject = new Subject();
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.subscribe(observer3);

        subject.notifyObservers(fileReader.readFile());

        Thread.sleep(10000); //wait for 10 seconds
        System.out.println("======================================================");

        subject.notifyObservers("Curfew will not be imposed today!");

        Thread.sleep(5000); //wait for 5 seconds

        subject.unsubscribe(observer2);

        Thread.sleep(5000); //wait for 5 seconds
        System.out.println("======================================================");

        subject.notifyObservers("Fuel prices gone up!");
        
    }
}
