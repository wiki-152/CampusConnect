package org.example.sda_project.Bean;

import jakarta.persistence.*;

@Entity
@Table(name = "Course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CourseName")
    private String courseName;

    @Column(name = "CourseCode")
    private String courseCode;

    @Column(name = "CourseDescription")
    private String courseDescription;

    @Column(name = "CourseCredit")
    private Integer courseCredit;

    @Column(name = "CourseLecturerId")
    private Integer courseLecturerId;

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public Integer getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }

    public Integer getCourseLecturerId() {
        return courseLecturerId;
    }

    public void setCourseLecturerId(Integer courseLecturerId) {
        this.courseLecturerId = courseLecturerId;
    }
}
