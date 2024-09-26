package org.example.sda_project.Repository;

import org.example.sda_project.Bean.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ModuleRepository extends JpaRepository<Module, Integer> {

    // Get All Modules
    @Query("SELECT m FROM Module m")
    List<Module> getAllModules();

}
