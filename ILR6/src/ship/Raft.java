package ship;

public class Raft extends Boat {
    Raft(String object, String name, int weight, String colour) {
        super(object, name, weight, colour);
    }

    @Override
    public void outputName() {
        System.out.println("Name raft " + getName());
    }
}
