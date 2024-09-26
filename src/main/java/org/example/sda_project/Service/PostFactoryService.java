package org.example.sda_project.Service;

import org.example.sda_project.Bean.PostFactory;
import org.example.sda_project.Repository.PostFactoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostFactoryService {

    @Autowired
    private PostFactoryRepository postFactoryRepository;

    public void addPostFactory(PostFactory postFactory) {
        postFactoryRepository.save(postFactory);
    }

    public PostFactory getPostFactoryById(Integer id) {
        return postFactoryRepository.findById(id).orElse(null);
    }

    public PostFactory updatePostFactory(PostFactory postFactory) {
        return postFactoryRepository.save(postFactory);
    }

    public void deletePostFactory(Integer id) {
        postFactoryRepository.deleteById(id);
    }

    public List<PostFactory> getAllPostFactories() {
        return postFactoryRepository.findAll();
    }
}
