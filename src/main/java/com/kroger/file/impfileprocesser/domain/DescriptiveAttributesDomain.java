package com.kroger.file.impfileprocesser.domain;

public class DescriptiveAttributesDomain {

    private Integer id;
    private Integer ordinalPosition;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    @Override
    public String toString() {
        return "DescriptiveAttributesDomain{" +
                "id=" + id +
                ", ordinalPosition=" + ordinalPosition +
                '}';
    }
}
