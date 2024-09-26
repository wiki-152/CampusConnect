package org.example.sda_project.Repository;

import org.example.sda_project.Bean.CourseCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseCatalogRepository extends JpaRepository<CourseCatalog, Integer> {

    // Get All CourseCatalogs
    @Query("SELECT cc FROM CourseCatalog cc")
    List<CourseCatalog> getAllCourseCatalogs();

}
