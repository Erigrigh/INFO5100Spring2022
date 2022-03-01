package com.algorithm;

public class Person {

    private String name;
    private int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void subscribe (SeattlePoliceDepartment spd) {

        spd.subscribe(this);
    }

    public void unsubscribe (SeattlePoliceDepartment spd) {
        spd.unsubscribe(this);
    }

    public void getNotification(SeattlePoliceDepartment spd){

        System.out.println("Person name:" + getName() + " age:" + getAge() + " get Notification: " + spd.getNotification());
    }
}
