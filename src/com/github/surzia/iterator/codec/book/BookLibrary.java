package com.github.surzia.iterator.codec.book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookLibrary implements Iterable<Book> {
    protected List<Book> books;

    public BookLibrary() {
        super();
        books = new ArrayList<>();
    }

    public boolean addBook(String language, String title, String author, long ISBN, double price) {
        Book book = new Book(language, title, author, ISBN, price);
        return books.add(book);
    }

    public boolean addBook(Book book) {
        return books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }

}
