package org.example.sda_project.Service;

import org.example.sda_project.Bean.Audio;
import org.example.sda_project.Repository.AudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AudioService {

    @Autowired
    private AudioRepository audioRepository;

    public void addAudio(Audio audio) {
        audioRepository.save(audio);
    }

    public Audio getAudioById(Integer id) {
        return audioRepository.findById(id).orElse(null);
    }

    public Audio updateAudio(Audio audio) {
        return audioRepository.save(audio);
    }

    public void deleteAudio(Integer id) {
        audioRepository.deleteById(id);
    }

    public List<Audio> getAllAudios() {
        return audioRepository.findAll();
    }



}
