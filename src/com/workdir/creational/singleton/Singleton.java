package com.workdir.creational.singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private static int num = 0;

    private Singleton(){
        System.out.println("I was create");
    }

    public static Singleton getSingleton() {
        num++;
        System.out.println(num);

        return singleton;
    }
}
