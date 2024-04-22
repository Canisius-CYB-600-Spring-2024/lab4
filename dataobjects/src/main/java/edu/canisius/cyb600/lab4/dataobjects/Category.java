package edu.canisius.cyb600.lab4.dataobjects;

import java.util.Date;
import java.util.Objects;

/**
 * Data Object for Category
 */
public class Category {
    private int categoryId;
    private String name;
    private Date lastUpdate;

    public Category() {
    }

    public Category(int categoryId, String name, Date lastUpdate) {
        this.categoryId = categoryId;
        this.name = name;
        this.lastUpdate = lastUpdate;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return categoryId == category.categoryId && Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, name);
    }
}
