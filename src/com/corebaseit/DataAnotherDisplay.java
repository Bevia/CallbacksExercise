package com.corebaseit;

/**
 * Created by vincentbevia on 14/09/16.
 */
public class DataAnotherDisplay implements DataSourceContrac{

    @Override
    public void displayData() {
        System.out.println("data from another data display");
    }

    @Override
    public void displayDataSource(String s) {
        System.out.println(s);
    }

    public void usingCompositionToCallMe() {
        System.out.println("data from another data display using composition");
    }
}
