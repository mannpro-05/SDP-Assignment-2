package com.bu.met662;

public class Driver implements SubscriberBase{

    private Shop shop;
    private String name;
    private String latestUpdate;
    Driver(Shop shop, String name){
        this.name = name;
        this.shop = shop;
        this.shop.addDrivers(this);
    }
    @Override
    public void getDeliveryUpdates(String message) {
        this.latestUpdate = message;
        System.out.println("Hello "+this.name+" "+ this.latestUpdate+" is available for delivery");

    }
}
