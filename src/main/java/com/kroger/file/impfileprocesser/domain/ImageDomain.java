package com.kroger.file.impfileprocesser.domain;

public class ImageDomain {

    private String perspective;
    private String size;
    private String url;
    private String guid;
    private String resolution;
    private String background;
    private String source;
    private String lastModifiedDate;
    private String impImageID;
    private String impImageURL;

    public String getPerspective() {
        return perspective;
    }

    public void setPerspective(String perspective) {
        this.perspective = perspective;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getImpImageID() {
        return impImageID;
    }

    public void setImpImageID(String impImageID) {
        this.impImageID = impImageID;
    }

    public String getImpImageURL() {
        return impImageURL;
    }

    public void setImpImageURL(String impImageURL) {
        this.impImageURL = impImageURL;
    }

    @Override
    public String toString() {
        return "ImageDomain{" +
                "perspective='" + perspective + '\'' +
                ", size='" + size + '\'' +
                ", url='" + url + '\'' +
                ", guid='" + guid + '\'' +
                ", resolution='" + resolution + '\'' +
                ", background='" + background + '\'' +
                ", source='" + source + '\'' +
                ", lastModifiedDate='" + lastModifiedDate + '\'' +
                ", impImageID='" + impImageID + '\'' +
                ", impImageURL='" + impImageURL + '\'' +
                '}';
    }
}

