package org.example.sda_project.Controller;

import org.example.sda_project.Bean.*;
import org.example.sda_project.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/StudentHome")
public class StudentController {

    private Student student;

    @Autowired
    CourseService  courseService;

    @Autowired
    EnrollmentService enrollmentService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private PostService postService;

    @Autowired
    private BookService bookService;

    @Autowired
    private ItemService itemService;

    @Autowired
    private NewsService newsService;

    @Autowired
    private PollService pollService;

    @GetMapping("")
    public String getStudentHomePage()
    {
        return "StudentHome";
    }

    @GetMapping("/{studentId}")
    public String getStudentHomePage(@PathVariable("studentId") Integer studentId , Model model)
    {
        student = studentService.getStudentById(studentId);

        // Print the student ID to the console
        //System.out.println("Student ID: " + studentId);

        model.addAttribute("student", student);
        return "StudentHome";
    }

    @RequestMapping("Feed")
    public String getFeedPage(Model model, Model model2)
    {
        List<Post> posts = postService.getAllPosts();

        model.addAttribute("posts", posts);

        // Student Details

        model2.addAttribute("student", student);


        return "Feed";
    }

    @RequestMapping("E-Learning_Student")
    public String getElearningPage(Model model, Model model2, Model model3, Model model4)
    {
        List<Course> courses = courseService.getAllCourses();
        model.addAttribute("courses", courses);

        List<Enrollment> enrollments = enrollmentService.getAllEnrollments();
        model2.addAttribute("enrollments", enrollments);

        // Student Details
        model3.addAttribute("student", student);

        Map<Integer, Course> courseMap = courses.stream().collect(Collectors.toMap(Course::getId, Function.identity()));
        model.addAttribute("coursesMaps", courseMap);


        return "E-Learning_Student";
    }

    @PostMapping("E-Learning_Student/enroll/{id}")
    public String enrollCourse(@RequestParam("courseId") Integer courseId)
    {
        // Print the course ID to the console
        System.out.println("Courses ID: " + courseId);
        // Enroll student to course
        Enrollment enrollment = new Enrollment();
        enrollment.setCourseId(courseId);
        enrollment.setStudentId(student.getId());
        enrollment.setGrade('I');

        enrollmentService.addEnrollment(enrollment);

        return "redirect:/StudentHome/E-Learning_Student";
    }

    @RequestMapping("E-Learning_Student/Unenroll/{id}")
    public String unenrollCourse(@RequestParam("courseId") Integer courseId)
    {
        // Print the course ID to the console
        System.out.println("Courses ID: " + courseId);
        // Unenroll student from course
        enrollmentService.deleteEnrollment(courseId);

        return "redirect:/StudentHome/E-Learning_Student";
    }

    @RequestMapping("StudentProfile")
    public String getStudentProfilePage(Model model)
    {
        model.addAttribute("user", student);

        return "ProfileStudent";
    }

    @PostMapping("StudentProfile/ProfileSave")
    public String saveUpdatedProfile(@RequestParam("firstName") String firstName,
                                     @RequestParam("lastName") String lastName,
                                     @RequestParam("emailaddress") String email, @RequestParam("password") String password,
                                     @RequestParam("dateOfBirth") String dateOfBirth, @RequestParam("gender") String gender)
    {
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setEmail(email);
        student.setPassword(password);
        student.setDateOfBirth(dateOfBirth);
        student.setGender(gender);

        studentService.updateStudent(student);

        return "redirect:/StudentHome";
    }


    @RequestMapping("Library_Student")
    public String getLibraryPage(Model model)
    {
        List<Book> books = bookService.getAllBooks();

        model.addAttribute("books", books);

        return "Library_Student";
    }

    @GetMapping("downloadBook/{id}")
    public ResponseEntity<Resource> downloadBook(@PathVariable("id") Integer id)
    {
        Book book = bookService.getBookById(id);

        if (book != null) {
            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_PDF)
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + book.getBookName() + ".pdf\"")
                    .body(new ByteArrayResource(book.getBookPdf()));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping("Marketplace")
    public String getMarketplacePage(Model model, Model model2)
    {
        List<Item> items = itemService.getAllItems();

        model.addAttribute("items", items);

        // Student Details
        model2.addAttribute("student", student);

        return "MarketplaceStudent";
    }

    @RequestMapping("Marketplace/AddItem")
    public String getAddItemPage(Model model)
    {
        return "AddItemStudent";
    }

    @RequestMapping("Marketplace/DeleteItem")
    public String getDeleteItemPage(Model model)
    {
        return "DeleteItemStudent";
    }

    @RequestMapping("HealthSupport")
    public String getHealthSupportPage(Model model)
    {
        return "HealthSupportStudent";
    }

    @RequestMapping("ClassSchedule")
    public String getClassSchedulePage(Model model)
    {
        return "ClassScheduleStudent";
    }

    @RequestMapping("CampusNewsAndAchievements")
    public String getCampusNewsAndAchievementsPage(Model model)
    {
        List<News> news = newsService.getAllNews();

        model.addAttribute("newss", news);

        return "CampusNewsAndAchievementsStudent";
    }

    @RequestMapping("CampusNewsAndAchievements/EmergencyContacts")
    public String getEmergencyContactsPage(Model model)
    {
        return "EmergencyContactsStudent";
    }

    @RequestMapping("Logout")
    public String logout()
    {
        return "redirect:/";
    }

    @RequestMapping("PollHome")
    public String getPollHome(Model model)
    {
        List<Poll> polls = pollService.getAllPolls();

        model.addAttribute("polls", polls);

        return "PollHomeStudent";
    }
}
