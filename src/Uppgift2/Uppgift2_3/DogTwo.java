package Uppgift2.Uppgift2_3;

public class DogTwo {
    private String name;
    private String ras;

    public DogTwo(String name, String ras) {
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
