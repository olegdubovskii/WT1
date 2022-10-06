package com.poit.lab1.task12;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null) {
            if (this.getClass().equals(obj.getClass())) {
                Book test = (Book) obj;
                return this.author.equals(test.getAuthor()) && this.title.equals(test.getTitle()) && this.price == test.getPrice();
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.author.hashCode()+this.title.hashCode()+this.price;
    }

    @Override
    public String toString() {
        return "Author: " + this.author + "\nTitle: " + this.title + "\nPrice: " + this.price + "\n";
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    @Override
    public int compareTo(Book book) {
        return this.isbn - book.isbn;
    }

    public static void main(String[] args) {
        Book book1 = new Book("1243", "56x7", 10412841, 1263);
        Book book2 = new Book("123", "567", 100463, 7341);
        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book1);
        System.out.println(book2);
    }
}
