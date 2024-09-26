package org.example.sda_project.Repository;

import org.example.sda_project.Bean.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {

    // Get All Posts
    @Query("SELECT p FROM Post p")
    List<Post> findAll();

    // Get Post by Student ID
    @Query("SELECT p FROM Post p WHERE p.studentId = :studentId")
    List<Post> findPostsByStudentId(Integer studentId);

    // Get Post by Teacher ID
    @Query("SELECT p FROM Post p WHERE p.teacherId = :teacherId")
    List<Post> findPostsByTeacherId(Integer teacherId);

}
