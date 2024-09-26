package org.example.sda_project.Service;

import org.example.sda_project.Bean.CourseCatalog;
import org.example.sda_project.Repository.CourseCatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseCatalogService {

    @Autowired
    private CourseCatalogRepository courseCatalogRepository;

    public void addCourseCatalog(CourseCatalog courseCatalog) {
        courseCatalogRepository.save(courseCatalog);
    }

    public CourseCatalog getCourseCatalogById(Integer id) {
        return courseCatalogRepository.findById(id).orElse(null);
    }

    public CourseCatalog updateCourseCatalog(CourseCatalog courseCatalog) {
        return courseCatalogRepository.save(courseCatalog);
    }

    public void deleteCourseCatalog(Integer id) {
        courseCatalogRepository.deleteById(id);
    }

    public List<CourseCatalog> getAllCourseCatalogs() {
        return courseCatalogRepository.findAll();
    }
}
