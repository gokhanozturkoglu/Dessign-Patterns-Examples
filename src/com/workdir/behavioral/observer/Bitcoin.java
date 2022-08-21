package com.workdir.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Bitcoin {

    List<User> users = new ArrayList<User>();

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        this.notifiyObservers();
    }

    public void subscribe(User user) {
        this.users.add(user);
    }

    public void unsubscribe(User user) {
        this.users.remove(user);
    }

    private void notifiyObservers() {
        for(User user : this.users) {
            user.update(this.getPrice());
        }
    }
}
