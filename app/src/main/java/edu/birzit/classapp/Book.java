package edu.birzit.classapp;

public class Book {
    int book_pages;
    double price;
    String title;
    String category;

    public Book(int book_pages, double price, String title, String category) {
        this.book_pages = book_pages;
        this.price = price;
        this.title = title;
        this.category = category;
    }
}
