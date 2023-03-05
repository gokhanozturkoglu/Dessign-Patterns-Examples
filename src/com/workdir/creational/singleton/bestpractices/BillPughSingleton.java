package com.workdir.creational.singleton.bestpractices;

public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    //BillPughSingleton sınıfı yüklendiğinde ; SingletonHelper sınıfı belleğe yüklenmez.
    //getInstance çağırıldığında yüklenir.
    //Synchronized gerekmediğinde bu yöntem en çok tercih edilen yöntemdir.

}
