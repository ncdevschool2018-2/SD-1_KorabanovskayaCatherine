package com.netcracker.edu.backend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Category {
    private Integer categoryId;
    private String categoryName;

    @Id
    @Column(name = "category_id", nullable = false)
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "category_name", nullable = false, length = 45)
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(categoryId, category.categoryId) &&
                Objects.equals(categoryName, category.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, categoryName);
    }
}
