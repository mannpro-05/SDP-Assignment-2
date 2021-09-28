package com.bu.met662;

import java.util.HashMap;
import java.util.Map;


public class Main {


    /**
     * A main method to run examples.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        Map<String, Shop> clothBrands = new HashMap<String, Shop>();
        Shop cloths = new Shop("Levis");
        clothBrands.put("Levis", new Shop("levis"));
        clothBrands.put("CK", new Shop("ck"));

        for (String key : clothBrands.keySet()) {
            for (int i = 1; i <= 5; i++) {
                new Driver(clothBrands.get(key), "Driver" + i);
            }
        }
        for (int i = 1; i <= 5; i++) {
            new Driver(cloths, "Mann" + i);
        }

        for (String key : clothBrands.keySet()) {
          clothBrands.get(key).newDeliveryRequest(key+" Jeans");
        }
    }
}


