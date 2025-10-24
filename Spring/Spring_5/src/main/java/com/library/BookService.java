package com.library;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        List<Book> books = bookRepository.getAllBooks();
        for (Book book : books) {
            System.out.println("📚 Book: " + book.getTitle());
        }
    }
}
