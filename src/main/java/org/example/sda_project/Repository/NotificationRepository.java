package org.example.sda_project.Repository;

import org.example.sda_project.Bean.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

    // Get All Notifications
    @Query("SELECT n FROM Notification n")
    List<Notification> getAllNotifications();

}
