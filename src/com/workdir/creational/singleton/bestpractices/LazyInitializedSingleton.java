package com.workdir.creational.singleton.bestpractices;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    /*tek threadli ortamda kullanılabilir.
      If cond. içinde birden fazla thread çalıştığı durumalarda,
      her bir thread farklı bir instance'ı yöneteceğinden singleton'ın amacı dışına çıkılır.
    */
}
