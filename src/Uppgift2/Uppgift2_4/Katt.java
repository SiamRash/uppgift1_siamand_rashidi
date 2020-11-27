package Uppgift2.Uppgift2_4;

class Katt {
    // Samma som Matte klassen som har både variabler och getmetoder och en konstruktör
    private String name;
    private String ras;
    private Matte ownerName;

    public Katt(String name, String ras) {
        this.name = name;
        this.ras = ras;

    }

    public String getName() {
        return name;
    }

    public String getRas() {
        return ras;
    }

    public Matte getOwnerName() {
        return ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public void setOwnerName(Matte ownerName) {
        this.ownerName = ownerName;
    }
}

