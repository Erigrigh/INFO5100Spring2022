package com.algorithm;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Data Structures and Algorithms", 12165, "Computer Science", 36.01);
        System.out.println("book name is " + book.getName());
        System.out.println("bookID is " + book.getBookID());
        System.out.println("book genres is " + book.getGenres());
        System.out.println("book price is $ " + book.getPrice());
    }
}
