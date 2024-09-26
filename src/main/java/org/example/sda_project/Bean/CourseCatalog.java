package org.example.sda_project.Bean;

import jakarta.persistence.*;

@Entity
@Table(name = "course_catalog")
public class CourseCatalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_catalog_id")
    private int courseCatalogId;

    // Getters and Setters

    public int getCourseCatalogId() {
        return courseCatalogId;
    }

    public void setCourseCatalogId(int courseCatalogId) {
        this.courseCatalogId = courseCatalogId;
    }
}
