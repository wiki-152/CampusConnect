package org.example.sda_project.Bean;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "Description")
    private String description;

    @Lob
    @Column(name = "image1", columnDefinition = "LONGBLOB", nullable = true)
    private byte[] image1;

    @Lob
    @Column(name = "image2", columnDefinition = "LONGBLOB", nullable = true)
    private byte[] image2;

    @Lob
    @Column(name = "image3", columnDefinition = "LONGBLOB", nullable = true)
    private byte[] image3;

    @Column(name = "Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date = new Date(); // Automatically set the date when created

    @Column(name = "StudentId")
    private Integer studentId;

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage1() {
        return image1;
    }

    public void setImage1(byte[] image1) {
        this.image1 = image1;
    }

    public byte[] getImage2() {
        return image2;
    }

    public void setImage2(byte[] image2) {
        this.image2 = image2;
    }

    public byte[] getImage3() {
        return image3;
    }

    public void setImage3(byte[] image3) {
        this.image3 = image3;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getBase64Image1() {
        if (this.image1 == null) {
            return null;
        }
        else
        {
            return "data:image/jpeg;base64," + Base64.getEncoder().encodeToString(this.image1);
        }
    }

    public String getBase64Image2() {
        if (this.image2 == null) {
            return null;
        }
        else
        {
            return "data:image/jpeg;base64," + Base64.getEncoder().encodeToString(this.image2);
        }
    }

    public String getBase64Image3() {
        if (this.image3 == null) {
            return null;
        }
        else
        {
            return "data:image/jpeg;base64," + Base64.getEncoder().encodeToString(this.image3);
        }
    }

}
