package org.example.sda_project.Bean;

import jakarta.persistence.*;

@Entity
@Table(name = "poll")
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "question")
    private String question;

    @Column(name = "answer1")
    private String answer1;

    @Column(name = "answer2")
    private String answer2;

    @Column(name = "answer3")
    private String answer3;

    @Column(name = "answer4")
    private String answer4;

    @Column(name = "vote_count1")
    private int voteCount1;

    @Column(name = "vote_count2")
    private int voteCount2;

    @Column(name = "vote_count3")
    private int voteCount3;

    @Column(name = "vote_count4")
    private int voteCount4;

    public int getVoteCount1() {
        return voteCount1;
    }

    public void setVoteCount1(int voteCount1) {
        this.voteCount1 = voteCount1;
    }

    public int getVoteCount2() {
        return voteCount2;
    }

    public void setVoteCount2(int voteCount2) {
        this.voteCount2 = voteCount2;
    }

    public int getVoteCount3() {
        return voteCount3;
    }

    public void setVoteCount3(int voteCount3) {
        this.voteCount3 = voteCount3;
    }

    public int getVoteCount4() {
        return voteCount4;
    }

    public void setVoteCount4(int voteCount4) {
        this.voteCount4 = voteCount4;
    }
    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }
}
