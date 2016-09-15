package com.corebaseit;

public class Main {


    public static void main(String[] args) {

        DataSourceContrac dataSourceContrac, dataSourceContrac1;
        DataSource dataSource;

        //Callsbacks:
        //set-up the contracts and their respective implementations!
        //notice how we are doign "down casting"
        dataSourceContrac = new DataDisplay(); //create a DataDisplay object of type DataSourceContrac
        dataSourceContrac1 = new DataAnotherDisplay();

        //this is read as follows:
        //---> if an object (the DataDisplay object) implements an interface,
        //     the instanceof operator returns true when is tested!
        //******************************************************************************
        //you can use the operator instanceof, as shown in this lines of code, to check
        //whether the object (DataDisplay) implements a the interface DataSourceContrac!
        //******************************************************************************
        //the proper way to read it is:
        //"if the variable dataSourceContract points to
        //the object that prompts DataSourceContrac (DataDisplay implements DataSourceContrac)
        // to do something...return true"
        //
        //set-up the caller class

        dataSource = new DataSource(dataSourceContrac);
        if (dataSourceContrac instanceof DataSourceContrac) {
            dataSource.callerMethod("hello there");
        }

        dataSource = new DataSource(dataSourceContrac1);
        if (dataSourceContrac1 instanceof DataSourceContrac) {
            dataSource.callerMethod("hello there again");
        }

        /*DataAnotherDisplay dataAnotherDisplay = new DataAnotherDisplay();
        dataAnotherDisplay.usingCompositionToCallMe();*/
        //is the same as:
        new DataAnotherDisplay().usingCompositionToCallMe();

    }
}
