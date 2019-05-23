package com.ocr.edward.Miam;

public class Four {
    protected int puissance;
    protected int capacite;

    protected Resistance resistance;
    private Soufflerie soufflerie;

    public void cuire(Aliment aliment){
        System.out.println("je cuis un aliment " + aliment.name);
        System.out.println("avec ma capacite de " + capacite + " litres");
        System.out.println("et ma puissance de  " + puissance + " degres");
        aliment.estCuit = true;
    }

    private void maintenir() {

    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        System.out.println("la puissance est modifiee");
        this.puissance = puissance;
    }

    public Resistance getResistance() {
        return resistance;
    }

    public Soufflerie getSoufflerie() {
        return soufflerie;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
