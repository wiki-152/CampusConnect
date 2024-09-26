package org.example.sda_project.Repository;

import org.example.sda_project.Bean.EventFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventFactoryRepository extends JpaRepository<EventFactory, Integer>{

    @Query("SELECT e FROM EventFactory e")
    List<EventFactory> getAllEvents();

}
