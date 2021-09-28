package com.bu.met662;

interface DeliveryRequest {
    void newDeliveryRequest(String newItem);
    void addDrivers(SubscriberBase obj);
    void notifyAllDrivers();
}
