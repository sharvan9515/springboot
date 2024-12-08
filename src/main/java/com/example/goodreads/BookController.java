package com.example.goodreads;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.ArrayList;
import com.example.goodreads.BookService;
import com.example.goodreads.Book;

@RestController
public class BookController {
    BookService bookService = new BookService();

    @GetMapping("/books")

    public ArrayList<Book> getBooks() {
        return bookService.getBooks();

    }

    @GetMapping("/books/{bookId}")

    public Book getBookById(@PathVariable("bookId") int bookId) {
        return bookService.getBookById(bookId);

    }
}