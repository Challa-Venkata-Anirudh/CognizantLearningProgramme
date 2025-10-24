package com.library;

import java.util.List;

public class BookService {
    private final String libraryName; // Constructor injection
    private BookRepository bookRepository; // Setter injection

    // Constructor for libraryName
    public BookService(String libraryName) {
        this.libraryName = libraryName;
    }

    // Setter injection for repository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("📚 Welcome to " + libraryName + "!");
        List<Book> books = bookRepository.getAllBooks();
        for (Book book : books) {
            System.out.println("📘 Book: " + book.title());
        }
    }
}
