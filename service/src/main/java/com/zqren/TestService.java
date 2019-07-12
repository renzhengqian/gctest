package com.zqren;

import java.sql.SQLOutput;

public class TestService {

    public String addService(){

        return  new TestDao().addDao();
    }

    public static void main(String[] args) {
        System.out.println(new TestService().addService());
    }
}
