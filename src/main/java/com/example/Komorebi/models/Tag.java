package com.example.Komorebi.models;

public class Tag {
    private String name, category;
    private Boolean isActive;

    public Boolean getActive() { return isActive; }

    public void setActive(Boolean active) { isActive = active; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
