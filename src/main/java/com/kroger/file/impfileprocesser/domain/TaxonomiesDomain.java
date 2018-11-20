package com.kroger.file.impfileprocesser.domain;

public class TaxonomiesDomain {

    private String departmentCode;
    private String department;
    private String commodityCode;
    private String commodity;
    private String subCommodity;
    private String subCommodityCode;

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    public String getSubCommodity() {
        return subCommodity;
    }

    public void setSubCommodity(String subCommodity) {
        this.subCommodity = subCommodity;
    }

    public String getSubCommodityCode() {
        return subCommodityCode;
    }

    public void setSubCommodityCode(String subCommodityCode) {
        this.subCommodityCode = subCommodityCode;
    }

    @Override
    public String toString() {
        return "TaxonomiesDomain{" +
                "departmentCode='" + departmentCode + '\'' +
                ", department='" + department + '\'' +
                ", commodityCode='" + commodityCode + '\'' +
                ", commodity='" + commodity + '\'' +
                ", subCommodity='" + subCommodity + '\'' +
                ", subCommodityCode='" + subCommodityCode + '\'' +
                '}';
    }
}

