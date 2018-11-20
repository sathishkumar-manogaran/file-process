package com.kroger.file.impfileprocesser.domain;

public class CategoryDomain {

    private Integer categoryCode;
    private String category;

    public Integer getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(Integer categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "CategoryDomain{" +
                "categoryCode=" + categoryCode +
                ", category='" + category + '\'' +
                '}';
    }
}
