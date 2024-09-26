package org.example.sda_project.Repository;

import org.example.sda_project.Bean.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

public interface PhotoRepository extends JpaRepository<Photo, Integer> {

    // Get All Photos
    @Query("SELECT p FROM Photo p")
    public List<Photo> getAllPhotos();

}
