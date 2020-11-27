package Uppgift2.uppgift2_2;

class Katter {
    // Samma som Matte klassen som har både variabler och getmetoder och en konstruktör
    private String name;
    private String ras;

    public Katter(String name, String ras) {
        this.name = name;
        this.ras = ras;
    }

    public String getName() {
        return name;
    }

    public String getRas() {
        return ras;
    }
    @Override
    public String toString() {
        return String.format("katten heter: %s , och rastillhörighet är: %s", name, ras);
    }
}

