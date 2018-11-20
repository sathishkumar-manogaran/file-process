package com.kroger.file.impfileprocesser.domain;

import java.util.Arrays;
import java.util.List;

public class FileDomain {

    private String upc;
    private String gtin;
    private String description;
    private String itemSize;
    private String brandName;
    private String brandId;
    private String familyTreeCommodityCode;
    private String familyTreeDepartmentCode;
    private String familyTreeSubcommodityCode;
    private String familyTreeCommodityName;
    private String familyTreeDepartmentName;
    private String familyTreeSubcommodityName;
    private String itemSizeUom;
    private String discontinueDate;
    private String itemContentSizeAmount;
    private String manufacturer;
    private String itemPackageType;
    private String orderBy;
    private String soldBy;
    private List<DivisionValueDomain> serviceCounter;
    private List<DivisionValueDomain> temperatureIndicator;
    private Boolean webSellable;
    private String customerFacingSize;
    private String[] keywords;
    private String mainImage;
    private List<TaxonomiesDomain> taxonomies;
    private List<CategoryDomain> categories;
    private String[] excludedBanners;
    private String forceSize;
    private Float minimumAdvertisedPrice;
    private String countryOfOrigin;
    private Boolean shipToHomeAuthFlag;
    private Float weightPerUnit;
    private Boolean shipToHomeMultiPackFlag;
    private Integer shipToHomeMultiPackAmt;
    private String romanceDescription;
    private Integer minimumAgeToBuy;
    private Boolean shipsWithColdPackFlag;
    private Boolean heatSensitiveFlag;
    private String taxCode;
    private Boolean prop65Flag;
    private Boolean soldInStoreEligible;
    private List<DescriptiveAttributesDomain> descriptiveAttributes;
    private List<ImageDomain> images;

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemSize() {
        return itemSize;
    }

    public void setItemSize(String itemSize) {
        this.itemSize = itemSize;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getFamilyTreeCommodityCode() {
        return familyTreeCommodityCode;
    }

    public void setFamilyTreeCommodityCode(String familyTreeCommodityCode) {
        this.familyTreeCommodityCode = familyTreeCommodityCode;
    }

    public String getFamilyTreeDepartmentCode() {
        return familyTreeDepartmentCode;
    }

    public void setFamilyTreeDepartmentCode(String familyTreeDepartmentCode) {
        this.familyTreeDepartmentCode = familyTreeDepartmentCode;
    }

    public String getFamilyTreeSubcommodityCode() {
        return familyTreeSubcommodityCode;
    }

    public void setFamilyTreeSubcommodityCode(String familyTreeSubcommodityCode) {
        this.familyTreeSubcommodityCode = familyTreeSubcommodityCode;
    }

    public String getFamilyTreeCommodityName() {
        return familyTreeCommodityName;
    }

    public void setFamilyTreeCommodityName(String familyTreeCommodityName) {
        this.familyTreeCommodityName = familyTreeCommodityName;
    }

    public String getFamilyTreeDepartmentName() {
        return familyTreeDepartmentName;
    }

    public void setFamilyTreeDepartmentName(String familyTreeDepartmentName) {
        this.familyTreeDepartmentName = familyTreeDepartmentName;
    }

    public String getFamilyTreeSubcommodityName() {
        return familyTreeSubcommodityName;
    }

    public void setFamilyTreeSubcommodityName(String familyTreeSubcommodityName) {
        this.familyTreeSubcommodityName = familyTreeSubcommodityName;
    }

    public String getItemSizeUom() {
        return itemSizeUom;
    }

    public void setItemSizeUom(String itemSizeUom) {
        this.itemSizeUom = itemSizeUom;
    }

    public String getDiscontinueDate() {
        return discontinueDate;
    }

    public void setDiscontinueDate(String discontinueDate) {
        this.discontinueDate = discontinueDate;
    }

    public String getItemContentSizeAmount() {
        return itemContentSizeAmount;
    }

    public void setItemContentSizeAmount(String itemContentSizeAmount) {
        this.itemContentSizeAmount = itemContentSizeAmount;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getItemPackageType() {
        return itemPackageType;
    }

    public void setItemPackageType(String itemPackageType) {
        this.itemPackageType = itemPackageType;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getSoldBy() {
        return soldBy;
    }

    public void setSoldBy(String soldBy) {
        this.soldBy = soldBy;
    }

    public List<DivisionValueDomain> getServiceCounter() {
        return serviceCounter;
    }

    public void setServiceCounter(List<DivisionValueDomain> serviceCounter) {
        this.serviceCounter = serviceCounter;
    }

    public List<DivisionValueDomain> getTemperatureIndicator() {
        return temperatureIndicator;
    }

    public void setTemperatureIndicator(List<DivisionValueDomain> temperatureIndicator) {
        this.temperatureIndicator = temperatureIndicator;
    }

    public Boolean getWebSellable() {
        return webSellable;
    }

    public void setWebSellable(Boolean webSellable) {
        this.webSellable = webSellable;
    }

    public String getCustomerFacingSize() {
        return customerFacingSize;
    }

    public void setCustomerFacingSize(String customerFacingSize) {
        this.customerFacingSize = customerFacingSize;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public List<TaxonomiesDomain> getTaxonomies() {
        return taxonomies;
    }

    public void setTaxonomies(List<TaxonomiesDomain> taxonomies) {
        this.taxonomies = taxonomies;
    }

    public List<CategoryDomain> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryDomain> categories) {
        this.categories = categories;
    }

    public String[] getExcludedBanners() {
        return excludedBanners;
    }

    public void setExcludedBanners(String[] excludedBanners) {
        this.excludedBanners = excludedBanners;
    }

    public String getForceSize() {
        return forceSize;
    }

    public void setForceSize(String forceSize) {
        this.forceSize = forceSize;
    }

    public Float getMinimumAdvertisedPrice() {
        return minimumAdvertisedPrice;
    }

    public void setMinimumAdvertisedPrice(Float minimumAdvertisedPrice) {
        this.minimumAdvertisedPrice = minimumAdvertisedPrice;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public Boolean getShipToHomeAuthFlag() {
        return shipToHomeAuthFlag;
    }

    public void setShipToHomeAuthFlag(Boolean shipToHomeAuthFlag) {
        this.shipToHomeAuthFlag = shipToHomeAuthFlag;
    }

    public Float getWeightPerUnit() {
        return weightPerUnit;
    }

    public void setWeightPerUnit(Float weightPerUnit) {
        this.weightPerUnit = weightPerUnit;
    }

    public Boolean getShipToHomeMultiPackFlag() {
        return shipToHomeMultiPackFlag;
    }

    public void setShipToHomeMultiPackFlag(Boolean shipToHomeMultiPackFlag) {
        this.shipToHomeMultiPackFlag = shipToHomeMultiPackFlag;
    }

    public Integer getShipToHomeMultiPackAmt() {
        return shipToHomeMultiPackAmt;
    }

    public void setShipToHomeMultiPackAmt(Integer shipToHomeMultiPackAmt) {
        this.shipToHomeMultiPackAmt = shipToHomeMultiPackAmt;
    }

    public String getRomanceDescription() {
        return romanceDescription;
    }

    public void setRomanceDescription(String romanceDescription) {
        this.romanceDescription = romanceDescription;
    }

    public Integer getMinimumAgeToBuy() {
        return minimumAgeToBuy;
    }

    public void setMinimumAgeToBuy(Integer minimumAgeToBuy) {
        this.minimumAgeToBuy = minimumAgeToBuy;
    }

    public Boolean getShipsWithColdPackFlag() {
        return shipsWithColdPackFlag;
    }

    public void setShipsWithColdPackFlag(Boolean shipsWithColdPackFlag) {
        this.shipsWithColdPackFlag = shipsWithColdPackFlag;
    }

    public Boolean getHeatSensitiveFlag() {
        return heatSensitiveFlag;
    }

    public void setHeatSensitiveFlag(Boolean heatSensitiveFlag) {
        this.heatSensitiveFlag = heatSensitiveFlag;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public Boolean getProp65Flag() {
        return prop65Flag;
    }

    public void setProp65Flag(Boolean prop65Flag) {
        this.prop65Flag = prop65Flag;
    }

    public Boolean getSoldInStoreEligible() {
        return soldInStoreEligible;
    }

    public void setSoldInStoreEligible(Boolean soldInStoreEligible) {
        this.soldInStoreEligible = soldInStoreEligible;
    }

    public List<DescriptiveAttributesDomain> getDescriptiveAttributes() {
        return descriptiveAttributes;
    }

    public void setDescriptiveAttributes(List<DescriptiveAttributesDomain> descriptiveAttributes) {
        this.descriptiveAttributes = descriptiveAttributes;
    }

    public List<ImageDomain> getImages() {
        return images;
    }

    public void setImages(List<ImageDomain> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "FileDomain{" +
                "upc='" + upc + '\'' +
                ", gtin='" + gtin + '\'' +
                ", description='" + description + '\'' +
                ", itemSize='" + itemSize + '\'' +
                ", brandName='" + brandName + '\'' +
                ", brandId='" + brandId + '\'' +
                ", familyTreeCommodityCode='" + familyTreeCommodityCode + '\'' +
                ", familyTreeDepartmentCode='" + familyTreeDepartmentCode + '\'' +
                ", familyTreeSubcommodityCode='" + familyTreeSubcommodityCode + '\'' +
                ", familyTreeCommodityName='" + familyTreeCommodityName + '\'' +
                ", familyTreeDepartmentName='" + familyTreeDepartmentName + '\'' +
                ", familyTreeSubcommodityName='" + familyTreeSubcommodityName + '\'' +
                ", itemSizeUom='" + itemSizeUom + '\'' +
                ", discontinueDate='" + discontinueDate + '\'' +
                ", itemContentSizeAmount='" + itemContentSizeAmount + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", itemPackageType='" + itemPackageType + '\'' +
                ", orderBy='" + orderBy + '\'' +
                ", soldBy='" + soldBy + '\'' +
                ", serviceCounter=" + serviceCounter +
                ", temperatureIndicator=" + temperatureIndicator +
                ", webSellable=" + webSellable +
                ", customerFacingSize='" + customerFacingSize + '\'' +
                ", keywords=" + Arrays.toString(keywords) +
                ", mainImage='" + mainImage + '\'' +
                ", taxonomies=" + taxonomies +
                ", categories=" + categories +
                ", excludedBanners=" + Arrays.toString(excludedBanners) +
                ", forceSize='" + forceSize + '\'' +
                ", minimumAdvertisedPrice=" + minimumAdvertisedPrice +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", shipToHomeAuthFlag=" + shipToHomeAuthFlag +
                ", weightPerUnit=" + weightPerUnit +
                ", shipToHomeMultiPackFlag=" + shipToHomeMultiPackFlag +
                ", shipToHomeMultiPackAmt=" + shipToHomeMultiPackAmt +
                ", romanceDescription='" + romanceDescription + '\'' +
                ", minimumAgeToBuy=" + minimumAgeToBuy +
                ", shipsWithColdPackFlag=" + shipsWithColdPackFlag +
                ", heatSensitiveFlag=" + heatSensitiveFlag +
                ", taxCode='" + taxCode + '\'' +
                ", prop65Flag=" + prop65Flag +
                ", soldInStoreEligible=" + soldInStoreEligible +
                ", descriptiveAttributes=" + descriptiveAttributes +
                ", images=" + images +
                '}';
    }
}
