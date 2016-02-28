package object;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals("myrzic", "cat", 20);
        System.out.println(animals.toString());
        animals.setCloneAnimals(animals);
        animals.transformation();

    }

}
