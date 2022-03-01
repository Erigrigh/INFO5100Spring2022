package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SeattlePoliceDepartment {


    private List<Person> subscribers = new ArrayList<>();
    private String notification;

    public String getNotification() {
        return notification;
    }
    public void setNotification(String notification) {
        this.notification = notification;
    }

    public void subscribe(Person p){
        subscribers.add(p);
    }
    public void unsubscribe(Person person) {

        subscribers.remove(subscribers.indexOf(person));
    }


    public void NotifyCitizens(String notification){
        this.setNotification(notification);
        for (Person p : subscribers) {
            p.getNotification(this);
        }
    }
}
