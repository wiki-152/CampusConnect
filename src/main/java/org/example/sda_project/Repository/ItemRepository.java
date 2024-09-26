package org.example.sda_project.Repository;

import org.example.sda_project.Bean.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    // Get All Items
    @Query("SELECT i FROM Item i")
    List<Item> findAll();

    // Get Item by Student ID
    @Query("SELECT i FROM Item i WHERE i.studentId = :studentId")
    List<Item> findItemsByStudentId(Integer studentId);

}
