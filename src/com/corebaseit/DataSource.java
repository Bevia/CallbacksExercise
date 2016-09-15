package com.corebaseit;

/**
 * Created by vincentbevia on 13/09/16.
 */
public class DataSource{

   DataSourceContrac dataSourceContrac;

    public DataSource(DataSourceContrac dataSourceContrac) {
        this.dataSourceContrac = dataSourceContrac;
    }

    public void callerMethod (String s){

        dataSourceContrac.displayDataSource(s);
        anotherCallerMethod();
    }

    private void anotherCallerMethod () {
        dataSourceContrac.displayData();
    }
}
