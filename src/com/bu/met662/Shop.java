package com.bu.met662;

import java.util.ArrayList;

public class Shop implements DeliveryRequest{
    private String brand;
    private String latestDeliveryUpdate;
    ArrayList<SubscriberBase> driverList = new ArrayList<SubscriberBase>();
    Shop(String brand){
        this.brand = brand;
        this.latestDeliveryUpdate = "No new updates";
    }
    @Override
    public void newDeliveryRequest(String newItem) {
        this.latestDeliveryUpdate = newItem;
        notifyAllDrivers();
    }

    @Override
    public void addDrivers(SubscriberBase obj) {
        driverList.add(obj);
    }

    @Override
    public void notifyAllDrivers() {
        for(SubscriberBase obj: driverList){
            obj.getDeliveryUpdates(this.latestDeliveryUpdate);
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLatestDeliveryUpdate() {
        return latestDeliveryUpdate;
    }

}
