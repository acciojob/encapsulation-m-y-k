package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly obj = new RWOnly();

        // error because name has private access in RWOnly class
        obj.setName("name");
        System.out.println(obj.getName());

    }
}