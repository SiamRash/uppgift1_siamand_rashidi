package Uppgift2.Uppgift2_3;

public class Husse {
    private String name;
    private DogOne dogOne;
    private DogTwo dogTwo;
    private DogThree dogThree;

    public Husse(String name, DogOne dogOne, DogTwo dogTwo, DogThree dogThree) {
        this.name = name;
        this.dogOne = dogOne;
        this.dogTwo = dogTwo;
        this.dogThree = dogThree;
    }

    public String getName() {
        return name;
    }

    public DogOne getDogOne() {
        return dogOne;
    }

    public DogTwo getDogTwo() {
        return dogTwo;
    }

    public DogThree getDogThree() {
        return dogThree;
    }
    @Override
    public String toString() {
        return String.format("Mitt namn är: %s, och jag har tre stycken hundar" +
                " och min första hund som heter %soch min andra hund heter %s" +
                " och min tredje hund är %s", name, dogOne, dogTwo, dogThree);
    }
}
