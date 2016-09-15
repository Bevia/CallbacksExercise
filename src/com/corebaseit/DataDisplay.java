package com.corebaseit;

/**
 * Created by vincentbevia on 13/09/16.
 */

public class DataDisplay implements DataSourceContrac {

    @Override
    public void displayData() {
        System.out.println("data from data display");
    }

    @Override
    public void displayDataSource(String s) {
        System.out.println(s);
    }

}
