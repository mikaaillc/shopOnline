package com.example.shoponline.Entities;

import javax.persistence.*;

@Entity
@Table(name = "\"Category\"")
public class Category {
    @Id
    @Column(name = "\"categoryId\"", nullable = false)
    private Long id;

    @Lob
    @Column(name = "\"categoryName\"")
    private String categoryName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}