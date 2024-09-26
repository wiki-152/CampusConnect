package org.example.sda_project.Repository;

import org.example.sda_project.Bean.PostFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostFactoryRepository extends JpaRepository<PostFactory, Integer> {

    // Get All PostFactories
    @Query("SELECT pf FROM PostFactory pf")
    List<PostFactory> getAllPostFactories();

}
