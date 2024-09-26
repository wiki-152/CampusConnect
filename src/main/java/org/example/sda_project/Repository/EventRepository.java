package org.example.sda_project.Repository;

import org.example.sda_project.Bean.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventRepository extends JpaRepository<Event, Integer> {

    @Query("SELECT e FROM Event e")
    List<Event> getAllEvents();

}
