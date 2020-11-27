package Uppgift2.uppgift2_1;

public class Main {
    public static void main(String[] args) {
        Hund hunden = new Hund("Toy", "Finsk Lapphund");
        Katt katten = new Katt("Tiger", "Katt");

        System.out.println("Hundens namn: " + hunden.getName() + " och hundens ras: " + hunden.getRas());
        System.out.println("Kattens namn: " + katten.getName() + " och kattens ras: " + katten.getRas());




    }
}
