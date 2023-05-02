package com.javatpoint.service;

import com.javatpoint.model.Books;
import com.javatpoint.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService {
    @Autowired
    BooksRepository booksRepository;

    public List<Books> getAllBooks(){
        List<Books> books = new ArrayList<Books>();
        booksRepository.findAll().forEach(books1 -> books.add(books1));
        return books;
    }
    public Books getBooksById(int id){
        return booksRepository.findById(id).get();
    }
    public Books saveOrUpdate(Books books){
        booksRepository.save(books);
        return booksRepository.save(books);
    }
    public Books update(Books books, int bookid){
        booksRepository.save(books);
        return booksRepository.save(books);
    }
    public void delete(int id){
        booksRepository.deleteById(id);
    }
}
