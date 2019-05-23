package com.ocr.edward.HomeShop;

public class DirectDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 4.99;
    }

    @Override
    public String getInfo() {
        return "Livraison a domicile 4.99e";
    }
}
