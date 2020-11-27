package Uppgift2.uppgift2_2;

public class Matte {
    // deklarerar två variabler
    private String name;
    private Katter kattensOwner;
    // en konstruktör som initialiserar mattes namn och katt objecten
    public Matte(String name, Katter owner) {
        this.name = name;
        this.kattensOwner = owner;
    }
    // en get metod som inte i bruk
    public String getName() {
        return name;
    }
    // en get metod av katt object som inte används ännu
    public Katter getKattensOwner() {
        return kattensOwner;
    }
    @Override
    public String toString() {
        return String.format("Mattens namn är: %s, och jag har en stor katt" +
                " och %s", name, kattensOwner);
    }
}
