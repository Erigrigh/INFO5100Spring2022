package com.algorithm;

public class Main {

    public static void main(String[] args) {
        //create the instance of Seattle Police Department
        SeattlePoliceDepartment spd = new SeattlePoliceDepartment();
        //Create instances of person.
        Person a = new Person("A", 25);
        Person b = new Person("B", 26);
        Person c = new Person("C", 27);

        //Subscribe some persons to SeattlePoliceDepartment
        a.subscribe(spd);
        b.subscribe(spd);
        c.subscribe(spd);
        //Publish a message from SeattlePoliceDepartment
        spd.NotifyCitizens("Citizens Alert from Seattle Police Department");

        //Unsubscribe users from SeattlePoliceDepartment
        a.unsubscribe(spd);
        b.unsubscribe(spd);
        //Publish the message again
        spd.NotifyCitizens("Citizens Alert from Seattle Police Department");
    }
}
