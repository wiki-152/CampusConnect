package org.example.sda_project.Bean;

import jakarta.persistence.*;
import org.example.sda_project.Interfaces.Media;

import java.util.Date;

@Entity
@Table(name = "Audio")
public class Audio implements Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "audioID")
    private int audioID;

    @Column(name = "audioURL")
    private String audioURL;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "datetimeUploaded")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeUploaded = new Date();

    @Column(name = "userID")
    private String userID;

    // Getters and Setters
    public int getAudioID() {
        return audioID;
    }

    public void setAudioID(int audioID) {
        this.audioID = audioID;
    }

    public String getAudioURL() {
        return audioURL;
    }

    public void setAudioURL(String audioURL) {
        this.audioURL = audioURL;
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

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    // Implementing Media interface methods
    @Override
    public void play() {
        System.out.println("Audio is playing");
    }

    @Override
    public void stop() {
        System.out.println("Audio is stopped");
    }

    @Override
    public void pause() {
        System.out.println("Audio is paused");
    }

    @Override
    public boolean update() {
        System.out.println("Audio updated");
        return true;
    }
}
