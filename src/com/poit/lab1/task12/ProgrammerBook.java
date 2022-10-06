package com.poit.lab1.task12;

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            ProgrammerBook test = (ProgrammerBook) obj;
            if (this.language.equals(test.getLanguage()) && this.level==test.getLevel()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.language.hashCode() + this.level;
    }

    @Override
    public String toString() {
        return super.toString() + "Language: " + this.language + "\nLevel: " + this.level + "\n";
    }

    public static void main(String[] args) {
        ProgrammerBook book1 = new ProgrammerBook("123", "456", 100, 7323, "Jaczxczva" , 7);
        Book book2 = new ProgrammerBook("123", "456", 100, 6697, "Java" , 7);
        System.out.println(book2.equals(book1));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book1);
        System.out.println(book2);
    }
}
