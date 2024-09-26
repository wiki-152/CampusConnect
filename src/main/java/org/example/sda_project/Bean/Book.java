package org.example.sda_project.Bean;

import jakarta.persistence.*;

@Entity
@Table(name = "Book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    @Column(name = "BookName")
    private String bookName;

    @Column(name = "BookAuthor")
    private String bookAuthor;

    @Column(name = "BookDescription")
    private String bookDescription;

    @Lob
    @Column(name = "BookPdf", columnDefinition = "LONGBLOB")
    private byte[] bookPdf;

    // Getters and setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public byte[] getBookPdf() {
        return bookPdf;
    }

    public void setBookPdf(byte[] bookPdf) {
        this.bookPdf = bookPdf;
    }
}
