package Uppgift2.uppgift2_2;



public class Main {
    public static void main(String[] args) {
        // katt object
        Katter dennaKatt = new Katter("Liam", "Lejon");
        // matte object
        Matte matte = new Matte("Ali", dennaKatt);
        System.out.println(matte);
    }
}
