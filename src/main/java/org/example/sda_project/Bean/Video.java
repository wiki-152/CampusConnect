package org.example.sda_project.Bean;

import jakarta.persistence.*;
import org.example.sda_project.Interfaces.Media;

import java.util.*;

@Entity
@Table(name = "Video")
public class Video implements Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "videoID")
    private int videoID;

    @Column(name = "userID")
    private String userID;

    @Column(name = "videoURL")
    private String videoURL;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "datetimeUploaded")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeUploaded = new Date();

    // Getters and Setters
    public int getVideoID() {
        return videoID;
    }

    public void setVideoID(int videoID) {
        this.videoID = videoID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDatetimeUploaded() {
        return datetimeUploaded;
    }

    public void setDatetimeUploaded(Date datetimeUploaded) {
        this.datetimeUploaded = datetimeUploaded;
    }

    // Implementing Media interface methods
    @Override
    public void play() {
        System.out.println("Video is playing");
    }

    @Override
    public void stop() {
        System.out.println("Video is stopped");
    }

    @Override
    public void pause() {
        System.out.println("Video is paused");
    }

    @Override
    public boolean update() {
        System.out.println("Video updated");
        return true;
    }
}
