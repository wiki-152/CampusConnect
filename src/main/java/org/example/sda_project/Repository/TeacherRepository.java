package org.example.sda_project.Repository;

import org.example.sda_project.Bean.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    @Query("SELECT t FROM Teacher t WHERE t.firstName = :firstName AND t.lastName = :lastName")
    List<Teacher> findTeachersByName(String firstName, String lastName);

    @Query("SELECT t FROM Teacher t WHERE t.email = :email")
    Teacher findTeacherByEmail(String email);

    @Query("SELECT t FROM Teacher t WHERE t.email = :email AND t.password = :password")
    Teacher findTeacherByEmailAndPassword(String email, String password);
}
