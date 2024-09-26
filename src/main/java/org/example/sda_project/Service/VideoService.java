package org.example.sda_project.Service;

import org.example.sda_project.Bean.Video;
import org.example.sda_project.Repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public void addVideo(Video video) {
        videoRepository.save(video);
    }

    public Video getVideoById(Integer id)
    {
        return videoRepository.findById(id).orElse(null);
    }

    public Video updateVideo(Video video)
    {
        return videoRepository.save(video);
    }

    public void deleteVideo(Integer id)
    {
        videoRepository.deleteById(id);
    }

    public List<Video> getAllVideos()
    {
        return videoRepository.findAll();
    }


}
