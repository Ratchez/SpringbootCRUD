package com.javatpoint.controller;

import com.javatpoint.model.Books;
import com.javatpoint.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class BooksController {
    @Autowired
    BooksService booksService;
    @GetMapping("/book")
    private List<Books> getAllBooks(){
        return booksService.getAllBooks();
    }
    @GetMapping("/book/{bookid}")
    private Books getBooks(@PathVariable("bookid") int bookid){
        return booksService.getBooksById(bookid);
    }
    @PostMapping("/books")
    private int saveBook(@RequestBody Books books){
        booksService.saveOrUpdate(books);
        return books.getBookid();
    }
    @PutMapping("/books")
    private Books updatebook(@RequestBody Books books){
        booksService.saveOrUpdate(books);
        return books;
    }
    @DeleteMapping("/book/{bookid}")
    private void deleteBook(@PathVariable("bookid") int bookid){
        booksService.delete(bookid);
    }
}
