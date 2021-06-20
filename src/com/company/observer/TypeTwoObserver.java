package com.company.observer;

//wrapping the food using the new paper
public class TypeTwoObserver implements Observer{

    @Override
    public void notifyObserver(String news){
        System.out.println("Wrap the foods using the name: " + news);
    }
}
