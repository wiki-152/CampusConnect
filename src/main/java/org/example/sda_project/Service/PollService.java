package org.example.sda_project.Service;

import org.example.sda_project.Bean.Poll;
import org.example.sda_project.Repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollService {

    @Autowired
    private PollRepository pollRepository;

    public void addPoll(Poll poll) {
        pollRepository.save(poll);
    }

    public Poll getPollById(Integer id) {
        return pollRepository.findById(id).orElse(null);
    }

    public Poll updatePoll(Poll poll) {
        return pollRepository.save(poll);
    }

    public void deletePoll(Integer id) {
        pollRepository.deleteById(id);
    }

    public List<Poll> getAllPolls() {
        return pollRepository.findAll();
    }
}
