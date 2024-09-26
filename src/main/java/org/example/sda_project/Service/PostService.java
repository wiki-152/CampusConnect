package org.example.sda_project.Service;

import org.example.sda_project.Bean.Post;
import org.example.sda_project.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public void addPost(Post post) {
        postRepository.save(post);
    }

    public Post getPostById(Integer id) {
        return postRepository.findById(id).orElse(null);
    }

    public Post updatePost(Post post) {
        return postRepository.save(post);
    }

    public void deletePost(Integer id) {
        postRepository.deleteById(id);
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public List<Post> getPostsByStudentId(Integer studentId) {
        return postRepository.findPostsByStudentId(studentId);
    }

    public List<Post> getPostsByTeacherId(Integer teacherId) {
        return postRepository.findPostsByTeacherId(teacherId);
    }





}
