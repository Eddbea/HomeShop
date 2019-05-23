package com.ocr.edward.Paris;

public class Taxi implements MoyenDeLocomotion {

    @Override
    public void deplace(String adresse) {
        System.out.println("Je suis un taxi et je vais a l'adresse " + adresse);
    }
}
