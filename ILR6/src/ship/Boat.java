package ship;

public abstract class Boat {

    String object;
    String name;
    int weight; // вес
    String colour;



    Boat(String object, String name, int weight, String colour) {
        this.object = object;
        this.name = name;
        this.weight = weight;
        this.colour = colour;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void outputObject() {
        System.out.println("Its " + getObject() + "!");
    }

    public abstract void outputName();

    public void outputWeight() {
        System.out.println("Its Weight = " + getWeight() + "kg.");
    }

    public void outputColour() {
        System.out.println("Its Colour " + getColour() + ".");
    }
}
