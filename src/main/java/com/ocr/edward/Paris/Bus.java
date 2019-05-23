package com.ocr.edward.Paris;

public class Bus implements MoyenDeLocomotion {

    @Override
    public void deplace(String adresse) {
        System.out.println("Je suis un bus et je vais a l'adresse " + adresse);
    }
}
