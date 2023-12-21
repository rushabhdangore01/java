package com.stream.java8;

public class Library {
    public void addBookToLibrary(Book book) {
        System.out.println("Adding book to the library:");
        book.printBookInfo();
        System.out.println("Book added to the library.\n");
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
    }
}