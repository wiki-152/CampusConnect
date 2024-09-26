package org.example.sda_project.Repository;

import org.example.sda_project.Bean.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Integer>{

    // Get All News
    @Query("SELECT n FROM News n")
    List<News> getAllNews();
}
