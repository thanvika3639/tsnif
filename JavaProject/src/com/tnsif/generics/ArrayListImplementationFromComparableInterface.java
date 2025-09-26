package com.tnsif.generics;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListImplementationFromComparableInterface {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("Java Basics", 450, "John Doe"));
        books.add(new Book("Data Structures", 350, "Alice Smith"));
        books.add(new Book("Algorithms", 500, "Robert Brown"));

        System.out.println("Original List:");
        for (Book b : books) {
            System.out.println(b);
        }
        
        Collections.sort(books);

        System.out.println("\nSorted List (by Price):");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

class Book implements Comparable<Book> {
    
    private String title;
    private int price;
    private String author;

    public Book(String title, int price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book [title = " + title + ", price = " + price + ", author = " + author + "]";
    }

    @Override
    public int compareTo(Book o) {
        if (this.price > o.price) {
            return 1;
        } else if (this.price < o.price) {
            return -1;
        } else {
            return 0;
        }
    }
}

