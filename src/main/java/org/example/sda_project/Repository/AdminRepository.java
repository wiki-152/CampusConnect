package org.example.sda_project.Repository;

import org.example.sda_project.Bean.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

    // Get All Admins
    @Query("SELECT a FROM Admin a")
    List<Admin> getAllAdmins();

}
