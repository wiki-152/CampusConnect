package org.example.sda_project.Controller;

import org.example.sda_project.Bean.Book;
import org.example.sda_project.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/BookHome")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("")
    public String getBookHomePage()
    {
        return "TeacherHome";
    }

    @GetMapping("AddBook")
    public String getAddBookPage()
    {
        return "AddBook";
    }

    @PostMapping("AddBook_submit")
    public String getAddBookSubmitPage(@RequestParam(name="bookName") String bookName,
                                   @RequestParam(name="bookAuthor") String bookAuthor,
                                   @RequestParam(name="bookDescription") String bookDescription,
                                       @RequestParam("bookPdf") MultipartFile bookPdf)
    {

        Book book = new Book();
        book.setBookName(bookName);
        book.setBookAuthor(bookAuthor);
        book.setBookDescription(bookDescription);

        try {
            book.setBookPdf(bookPdf.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            return "redirect:/BookHome/AddBook?error";
        }

        bookRepository.save(book);


        return "LibraryHome";
    }


}
