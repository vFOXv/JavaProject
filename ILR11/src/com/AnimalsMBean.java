package com;

/**
 * Created by Admin on 28.02.16.
 */
public interface AnimalsMBean {
    String getType();

    void setType(String type);

    String getName();

    void setName(String name);

    int getWeight();

    void setWeight(int weight);

    Animals getCloneAnimals();

    void setCloneAnimals(Animals cloneAnimals);

    @Override
    String toString();

    String clone() throws CloneNotSupportedException;
}
