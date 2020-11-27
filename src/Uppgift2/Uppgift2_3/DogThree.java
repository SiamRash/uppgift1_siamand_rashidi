package Uppgift2.Uppgift2_3;

public class DogThree {
    private String name;
    private String ras;

    public DogThree(String name, String ras) {
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
        return String.format("%s och rastillhörighet är %s", name, ras);
    }
}
