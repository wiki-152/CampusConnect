package org.example.sda_project.Repository;

import org.example.sda_project.Bean.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

public interface VideoRepository extends JpaRepository<Video, Integer>{

    // Get all videos
    @Query("SELECT v FROM Video v")
    public List<Video> getAllVideos();


}
