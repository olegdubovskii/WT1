package com.poit.lab1.task12;

import java.util.Comparator;

public class BookComparatorByAuthorThenByTItleThenByPrice implements Comparator<Book> {

    @Override
    public int compare(Book book, Book t1) {
        Comparator<Book> bookComparator = new BookComparatorByAuthor().thenComparing(new BookComparatorByTitle()
                .thenComparing(new BookComparatorByPrice()));
        return bookComparator.compare(book, t1);
    }
}
