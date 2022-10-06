package com.poit.lab1.task12;

import java.util.Comparator;

public class BookComparatorByTitle implements Comparator<Book> {

    @Override
    public int compare(Book book, Book t1) {
        return book.getTitle().compareTo(t1.getTitle());
    }
}
