package org.example.sda_project.Repository;

import org.example.sda_project.Bean.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {

    // Get All Schedules
    @Query("SELECT s FROM Schedule s")
    List<Schedule> getAllSchedules();

}
