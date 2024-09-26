package org.example.sda_project.Bean;

import jakarta.persistence.*;

@Entity
@Table(name = "Enrollment")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "StudentId")
    private Integer studentId;

    @Column(name = "CourseId")
    private Integer courseId;

    @Column(name = "Grade")
    private Character grade;

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId)
    {
        this.courseId = courseId;
    }

    public Character getGrade()
    {
        return grade;
    }

    public void setGrade(Character grade)
    {
        this.grade = grade;
    }

}
