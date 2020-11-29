package com.jpappsworld.recycelrviewapp.webservice.rest.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MonitorModelJson {

    @SerializedName("Feature")
    @Expose
    private String feature;
    @SerializedName("HostName")
    @Expose
    private String hostName;
    @SerializedName("ModelName")
    @Expose
    private String modelName;
    @SerializedName("SerialNumber")
    @Expose
    private String serialNumber;
    @SerializedName("Value")
    @Expose
    private String value;

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
