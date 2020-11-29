package com.jpappsworld.recycelrviewapp.webservice.rest.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MonitorModelEntity {

    @SerializedName("MonitorModel")
    @Expose
    private List<MonitorModelJson> monitorModel = null;

    public List<MonitorModelJson> getMonitorModel() {
        return monitorModel;
    }

    public void setMonitorModel(List<MonitorModelJson> monitorModel) {
        this.monitorModel = monitorModel;
    }
}
