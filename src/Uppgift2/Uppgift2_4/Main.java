package Uppgift2.Uppgift2_4;


public class Main {
    public static void main(String[] args) {
        Katt katt = new Katt("liam", "Lejon");
        Matte matte = new Matte("Ali");

        var dennaMatte = matte.getName();
        var namnet = katt.getName();
        var rasen = katt.getRas();

        System.out.println("Den här matten " + dennaMatte + " har katten " + namnet + " och " +
                "den har rastillhörighet " + rasen );

        matte.setKatt(katt);
        katt.setOwnerName(matte);

        System.out.println(matte.getName() + " har katten " + matte.getKatt().getName()
                + " Som är ett " + matte.getKatt().getRas());
        System.out.println(katt.getName() + " vem är din matte ? " + katt.getOwnerName().getName() +
                " är min matte" +
                " och han är jätte snäll mot mig\n" +
                "men om han är dum mot mig då äter jag upp honom, jag är trots allt ett " + katt.getRas());







    }
}
