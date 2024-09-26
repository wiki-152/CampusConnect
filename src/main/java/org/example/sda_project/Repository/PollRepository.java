package org.example.sda_project.Repository;

import org.example.sda_project.Bean.Poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PollRepository extends JpaRepository<Poll, Integer> {

    // Get All Polls
    @Query("SELECT p FROM Poll p")
    List<Poll> getAllPolls();

}
