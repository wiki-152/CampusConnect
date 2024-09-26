package org.example.sda_project.Service;

import org.example.sda_project.Bean.Photo;
import org.example.sda_project.Repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository photoRepository;

    public void addPhoto(Photo photo) {
        photoRepository.save(photo);
    }

    public Photo getPhotoById(Integer id) {
        return photoRepository.findById(id).orElse(null);
    }

    public Photo updatePhoto(Photo photo) {
        return photoRepository.save(photo);
    }

    public void deletePhoto(Integer id) {
        photoRepository.deleteById(id);
    }

    public List<Photo> getAllPhotos() {
        return photoRepository.findAll();
    }

}
