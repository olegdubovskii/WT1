package com.poit.lab1.task12;

import java.util.Comparator;

public class BookComparatorByAuthorThenByTitle implements Comparator<Book> {

    @Override
    public int compare(Book book, Book t1) {
        Comparator<Book> bookComparatorByAuthorThenByTitle = new BookComparatorByAuthor().thenComparing(new BookComparatorByTitle());
        return bookComparatorByAuthorThenByTitle.compare(book, t1);
    }
}
