package org.example.sda_project.Repository;

import org.example.sda_project.Bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    // Get All Books
    @Query("SELECT b FROM Book b")
    public List<Book> getAllBooks();



}
