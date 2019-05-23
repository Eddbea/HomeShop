package com.ocr.edward.Miam;

public class Aliment {
    String name;
    boolean estCuit;

    public void manger() {
        if (estCuit)
            System.out.println("Miam miam cet aliment " + name + " est bien cuit");
        else
            System.out.println("Beeerk cet aliemnt " + name + " est cru !");
    }
}
