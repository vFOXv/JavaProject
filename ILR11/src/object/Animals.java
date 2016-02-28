package object;




public class Animals  {
    private String type;
    private int weight;//вес
    private String name;
    private Animals cloneAnimals;

    Animals(){
    }

    Animals(String name, String type){
        this.name = name;
        this.type = type;
    }

    Animals(String name, String type, int weight){
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public Animals getCloneAnimals() {
        return cloneAnimals;
    }


    public void setCloneAnimals(com.Animals cloneAnimals) {

    }


    public void setCloneAnimals(Animals cloneAnimals) {
        this.cloneAnimals = cloneAnimals;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", cloneAnimals=" + cloneAnimals +
                '}';
    }

    @Override
    public String clone() throws CloneNotSupportedException {
        return null;
    }
    public void transformation (){
//        setName("Tyzik");
//        setType("dog");
//        setWeight(25);
        System.out.println(getCloneAnimals());
    }

}

