package org.example.sda_project.Repository;

import org.example.sda_project.Bean.Audio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

public interface AudioRepository extends JpaRepository<Audio, Integer>{

    // Get All Audios
    @Query("SELECT a FROM Audio a")
    public List<Audio> getAllAudios();

}
