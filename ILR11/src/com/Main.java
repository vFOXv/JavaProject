package com;

public class Main {


    public static void main(String[] args) throws CloneNotSupportedException {

        Animals animals = new Animals("myrzic", "cat", 20);
        try {
            System.out.println(animals.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        animals.setName("Tyzik");
        animals.setType("dog");
        animals.setWeight(25);
        System.out.println(animals.getCloneAnimals().toString());
    }


}
