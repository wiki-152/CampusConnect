package org.example.sda_project.Service;

import org.example.sda_project.Bean.Notification;
import org.example.sda_project.Repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public void addNotification(Notification notification) {
        notificationRepository.save(notification);
    }

    public Notification getNotificationById(Integer id) {
        return notificationRepository.findById(id).orElse(null);
    }

    public Notification updateNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    public void deleteNotification(Integer id) {
        notificationRepository.deleteById(id);
    }

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }
}
