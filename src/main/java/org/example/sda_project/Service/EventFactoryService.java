package org.example.sda_project.Service;

import org.example.sda_project.Bean.EventFactory;
import org.example.sda_project.Repository.EventFactoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventFactoryService {

    @Autowired
    private EventFactoryRepository eventFactoryRepository;

    public void addEventFactory(EventFactory eventFactory) {
        eventFactoryRepository.save(eventFactory);
    }

    public EventFactory getEventFactoryById(Integer id) {
        return eventFactoryRepository.findById(id).orElse(null);
    }

    public EventFactory updateEventFactory(EventFactory eventFactory) {
        return eventFactoryRepository.save(eventFactory);
    }

    public void deleteEventFactory(Integer id) {
        eventFactoryRepository.deleteById(id);
    }

    public List<EventFactory> getAllEventFactories() {
        return eventFactoryRepository.findAll();
    }
}
