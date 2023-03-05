package com.workdir.creational.singleton.bestpractices;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor to avoid client applications using the constructor
    private EagerInitializedSingleton() {}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    /*If your singleton class is not using a lot of resources, this is the approach to use.
      But in most of the scenarios, singleton classes are created for resources such as File System, Database connections, etc.
      We should avoid the instantiation unless the client calls the getInstance method.
    */
}
