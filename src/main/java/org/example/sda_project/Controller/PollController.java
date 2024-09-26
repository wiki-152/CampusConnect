package org.example.sda_project.Controller;

import org.example.sda_project.Bean.Poll;
import org.example.sda_project.Repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/PollHome")
public class PollController {

    @Autowired
    private PollRepository pollRepository;

    @RequestMapping("")
    public String pollHome() {
        return "Default";
    }

    @PostMapping("/submitVote")
    public String submitVote(@RequestParam int pollId, @RequestParam int vote, Model model) {
        Poll poll = pollRepository.findById(pollId).orElse(null);

        if (poll != null) {
            switch (vote) {
                case 1:
                    poll.setVoteCount1(poll.getVoteCount1() + 1);
                    break;
                case 2:
                    poll.setVoteCount2(poll.getVoteCount2() + 1);
                    break;
                case 3:
                    poll.setVoteCount3(poll.getVoteCount3() + 1);
                    break;
                case 4:
                    poll.setVoteCount4(poll.getVoteCount4() + 1);
                    break;
            }
            pollRepository.save(poll);
        }

        List<Poll> polls = pollRepository.findAll();

        model.addAttribute("polls", polls);

        return "PollHomeStudent";
    }

    @GetMapping("/results")
    public String getResults(@RequestParam int pollId, Model model) {
        Poll poll = pollRepository.findById(pollId).orElse(null);
        model.addAttribute("poll", poll);
        return "pollResults";
    }

}
