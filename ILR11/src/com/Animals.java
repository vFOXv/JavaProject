package com;

public class Animals implements Cloneable, AnimalsMBean {
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
@Override
    public String getType(){
        return type;
    }
@Override
    public void setType(String type){
        this.type = type;
    }
@Override
    public String getName() {
        return name;
    }
@Override
    public void setName(String name) {
        this.name = name;
    }
@Override
    public int getWeight(){
        return weight;
    }
@Override
    public void setWeight(int weight){
        this.weight = weight;
    }
@Override
    public Animals getCloneAnimals() {
        return cloneAnimals;
    }
@Override
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
        this.cloneAnimals = (Animals) super.clone();
        return this.cloneAnimals.toString();
    }
}
