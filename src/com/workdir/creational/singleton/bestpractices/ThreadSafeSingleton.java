package com.workdir.creational.singleton.bestpractices;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /*Yukarıdaki metod iyi çalışıyor ve thread güvenliği sağlıyor,
    ancak buna yalnızca ayrı instance'lar oluşturabilecek
    ilk birkaç thread için ihtiyacımız olmasına rağmen, performansı düşürüyor.

    Bu ek yükü her seferinde önlemek için çift kontrollü synchronized prensibi kullanılır.
    Bu yaklaşımda, bir singleton sınıfından yalnızca bir instance oluşturulmasını sağlamak için
    ek bir if koşulunun içinde synchronized blok kullanılır.*/
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
