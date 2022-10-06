package com.poit.lab1.task12;

import java.util.Comparator;

public class BookComparatorByTitleThenByAuthor implements Comparator<Book> {

    @Override
    public int compare(Book book, Book t1) {
        Comparator<Book> bookComparator = new BookComparatorByTitle().thenComparing(new BookComparatorByAuthor());
        return bookComparator.compare(book, t1);
    }
}
