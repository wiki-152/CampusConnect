package org.example.sda_project.Service;

import org.example.sda_project.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.sda_project.Bean.Book;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public Book getBookById(Integer id)
    {
        return bookRepository.findById(id).orElse(null);
    }

    public Book updateBook(Book book)
    {
        return bookRepository.save(book);
    }

    public void deleteBook(Integer id)
    {
        bookRepository.deleteById(id);
    }

    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }


}
