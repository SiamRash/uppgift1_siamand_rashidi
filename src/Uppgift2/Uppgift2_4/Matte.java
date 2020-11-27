package Uppgift2.Uppgift2_4;

public class Matte {
    // deklarerar två variabler
    private String name;
    private Katt katt;
    // en konstruktör som initialiserar mattes namn och katt objecten
    public Matte(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Katt getKatt() {
        return katt;
    }

    public void setKatt(Katt katt) {
        this.katt = katt;
    }

}
