package com.kroger.file.impfileprocesser.domain;

public class DivisionValueDomain {

    private String division;
    private String value;

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DivisionValueDomain{" +
                "division='" + division + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
