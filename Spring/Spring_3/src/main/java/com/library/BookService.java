package com.library;

public class BookService {
    private BookRepository bookRepository;

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        bookRepository.addBook(book);
    }

    public void displayBooks() {
        for (Book book : bookRepository.getAllBooks()) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}
