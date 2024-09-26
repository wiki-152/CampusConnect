package org.example.sda_project.Bean;

import jakarta.persistence.*;

import org.example.sda_project.Bean.Event;

import java.util.*;


@Entity
@Table(name = "EventFactory")
public class EventFactory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//
//    // Relationships
//    @OneToMany(mappedBy = "eventFactory")
//    private List<Event> events = new ArrayList<>();

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public List<Event> getEvents() {
//        return events;
//    }
//
//    public void setEvents(List<Event> events) {
//        this.events = events;
//    }

}
