package com.github.surzia.iterator.codec.book;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("English", "Head First Java, 2nd Edition", "Kathy Sierra", 10123758943L, 10.5d);
        books[1] = new Book("English", "Effective Java (3rd Edition)", "Bloch Joshua", 34422235432L, 8.65d);
        books[2] = new Book("English", "Mastering Java Machine Learning", "Dr Uday Kamath", 2123765476L, 21.45d);
        books[3] = new Book("English", "Cloud-Native Java", "Kenny Bastani ", 21332343434L, 28.99d);
        books[4] = new Book("English", "Java 9 Modularity", "Paul Bakker", 1645243587L, 36.68d);
        BookStore store = new BookStore();
        BookLibrary library = new BookLibrary();
        Arrays.stream(books).forEach(book -> {
            System.out.println(store.addBook(book));
            System.out.println(library.addBook(book));
        });
        System.out.println("Printing Book details of Book Store");
        System.out.println(
                "-------------------------------------------------------------------------------------------------");
        printBooks(store);
        System.out.println("Printing Book details of Book Library");
        System.out.println(
                "-------------------------------------------------------------------------------------------------");
        printBooks(library);
    }

    private static void printBooks(Iterable<Book> books) {
        // String language, String title, String author, long ISBN, double price
        System.out.printf("%10s | %35s | %15s | %15s | %10s\n", "Language", "Title", "Author", "ISBN", "Price");
        System.out.println(
                "-------------------------------------------------------------------------------------------------");
        for (Book book : books) {
            System.out.printf("%10s | %35s | %15s | %15s | %10.2f\n", book.getLanguage(), book.getTitle(),
                    book.getAuthor(), book.getISBN(), book.getPrice());
        }
        System.out.println(
                "-------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}
