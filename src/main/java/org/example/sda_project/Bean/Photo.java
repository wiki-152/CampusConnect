package org.example.sda_project.Bean;

import jakarta.persistence.*;
import org.example.sda_project.Interfaces.Media;

import java.util.Date;

@Entity
@Table(name = "Photo")
public class Photo implements Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photoID")
    private int photoID;

    @Column(name = "albumID")
    private String albumID;

    @Column(name = "userID")
    private String userID;

    @Column(name = "photoURL")
    private String photoURL;

    @Column(name = "caption")
    private String caption;

    @Column(name = "datetimeUploaded")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeUploaded = new Date();

    // Getters and Setters
    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public String getAlbumID() {
        return albumID;
    }

    public void setAlbumID(String albumID) {
        this.albumID = albumID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
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
        System.out.println("Photo is displayed");
    }

    @Override
    public void stop() {
        System.out.println("Photo display stopped");
    }

    @Override
    public void pause() {
        throw new UnsupportedOperationException("Pause operation is not supported for photos.");
    }

    @Override
    public boolean update() {
        System.out.println("Photo updated");
        return true;
    }
}
