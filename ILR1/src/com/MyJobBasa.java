package com;

public class MyJobBasa implements Cloneable{//чтобы этой ошибки не было java.lang.CloneNotSupportedException: com.MyJobBasa нужно добавить implements Cloneable

    String name;
    int age;
    int rate;
    MyJobBasa myClone;

    MyJobBasa() {
    }

    public MyJobBasa(String name, int age, int rate, MyJobBasa myClone) {
        this.name = name;
        this.age = age;
        this.rate = rate;
        this.myClone = myClone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public MyJobBasa getMyClone() throws CloneNotSupportedException {
        return myClone;
    }

    public void setMyClone(MyJobBasa myClone) {
        this.myClone = myClone;
    }

    @Override
    public String toString() {
        return "MyJobBasa{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rate=" + rate +
                ", clone=" + myClone +
                '}';
    }

    @Override
    protected MyJobBasa clone() throws CloneNotSupportedException {
        return (MyJobBasa) super.clone();
    }
}
