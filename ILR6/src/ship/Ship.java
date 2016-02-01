package ship;

public class Ship extends Boat{

    public Ship(String objact, String name, int weight, String colour) {
        super(objact, name, weight, colour);
    }

    @Override
    public void outputName() {
        System.out.println("Name ship " + getName());
    }
}
