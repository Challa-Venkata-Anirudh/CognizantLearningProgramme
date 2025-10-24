package com.library;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
    public List<Book> getAllBooks() {
        return Arrays.asList(new Book("The Alchemist"), new Book("Clean Code"));
    }
}
