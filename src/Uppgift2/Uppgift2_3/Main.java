package Uppgift2.Uppgift2_3;

public class Main {
    public static void main(String[] args) {
        DogOne dogOne = new DogOne("Polly","Lanccashire heeler");
        DogTwo dogTwo = new DogTwo("Vix", "Aussie");
        DogThree dogThree = new DogThree("saga", "Golden retriever");
        Husse husse = new Husse("Linda", dogOne, dogTwo, dogThree);

        System.out.println(husse);
    }
}
