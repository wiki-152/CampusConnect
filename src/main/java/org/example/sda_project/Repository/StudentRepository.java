package org.example.sda_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import org.example.sda_project.Bean.*;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("SELECT s FROM Student s WHERE s.firstName = :firstName AND s.lastName = :lastName")
    List<Student> findStudentsByName(String firstName, String lastName);

    @Query("SELECT s FROM Student s WHERE s.email = :email")
    Student findStudentByEmail(String email);

    @Query("SELECT s FROM Student s WHERE s.email = :email AND s.password = :password")
    Student findStudentByEmailAndPassword(String email, String password);
}
