package com.poit.lab1.task12;

import java.util.Comparator;

public class BookComparatorByPrice implements Comparator<Book> {

    @Override
    public int compare(Book book, Book t1) {
        return book.getPrice() - t1.getPrice();
    }

}
