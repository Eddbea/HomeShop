package com.ocr.edward.Miam;

public class Main {
    public static void main(String[] args) {
        Four petitFour = new Four();
        petitFour.capacite = 30;
        petitFour.puissance = 180;

        Four grandFour = new Four();
        grandFour.capacite = 55;
        grandFour.puissance = 260;

      Aliment cake = new Aliment();
      cake.name = "Cake aux fruits";
      cake.estCuit = false ;
      cake.manger();
        System.out.println();
        grandFour.cuire(cake);
        cake.manger();
    }
}
