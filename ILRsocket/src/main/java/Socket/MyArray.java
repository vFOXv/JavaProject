package Socket;

public class MyArray {
    protected Animals[] arrayAnimals = myArrayAnimals();

    public Animals[] getArrayAnimals() {
        return arrayAnimals;
    }

    public void setArrayAnimals(Animals[] arrayAnimals) {
        this.arrayAnimals = arrayAnimals;
    }

    public Animals[] myArrayAnimals() {

        Animals dog = new Animals("Tyzic", "dog", 20);
        Animals cat = new Animals("Murzic", "cat", 10);
        Animals horse = new Animals("Sam", "horse", 300);
        Animals leon = new Animals("Leo", "leon", 250);
        Animals manki = new Animals("Ki-Ki", "manki", 30);

        return  new Animals[]{dog, cat, horse, leon, manki};
    }
}
