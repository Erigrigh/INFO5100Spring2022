package com.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> list = new ArrayList<>();

        Player p0 = new Player("Alice", 10);
        Player p1 = new Player("Bruce", 12);
        Player p2 = new Player("Clark", 23);
        Player p3 = new Player("Dylan", 35);
        Player p4 = new Player("Ethan", 56);
        Player p5 = new Player("Frank", 67);
        Player p6 = new Player("Gavin", 77);
        Player p7 = new Player("Henry", 88);
        Player p8 = new Player("Iris", 88);
        Player p9 = new Player("Jack", 88);

        list.add(p0);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);

        // lambda expression
        //Collections.sort(list, (a,b) -> b.getScore() - a.getScore() == 0 ? a.getName().compareTo(b.getName()) : b.getScore() - a.getScore());

        // Override the compare method of the new Comparator<>
        Collections.sort(list,new Comparator<Player>(){
            @Override
            public int compare(Player a, Player b) {
                return b.getScore() - a.getScore() == 0 ? a.getName().compareTo(b.getName()) : b.getScore() - a.getScore();
            }
        });

        for (Player p : list) {
            System.out.println(p.getScore() + " " + p.getName());
        }

    }
}
