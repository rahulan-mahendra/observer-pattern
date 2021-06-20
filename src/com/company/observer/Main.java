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

        //you can create a folder in your machine called news
        //whenever you have new news you can create a new text file and add theme to it and copy the text file in to news folder
        //our subject class keep watching the news folder -> and whenever new news is available, it call the notifyObservers method with
        //the you can delete the news file
        //keep watching for more news

        //create a small gui
        //create a from to enter the name and email address of user
        //and submit -> you can add item to the observer List
    }
}
