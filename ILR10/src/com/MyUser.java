package com;


public class MyUser {
    String name;
    int age;

    MyUser() {
        name = "defauld";
    }

    MyUser(String name, int age) {
        this.name = name;
        this.age = age;

    }

    private MyUser(String name, String n) {

    }

    public int getAge() {//В КАЧЕСТВЕ ПАРАМЕТРА НИЧЕГО НЕ ОЖИДАЕТ, ПОЭТОМУ НА УРОВНЕ ТЕСТИРОВАНИЯ, ПРИ ОБРАЩЕНИИ К НЕМУ, МЫ ПЕРЕДАЕМ NULL
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int myAge() {
        int myAge = getAge() + 10;
        setAge(getAge() + 10);
        System.out.println("getAge() >----> "+getAge());
        return myAge;

    }

    @Override
    public String toString() {
        myAge();
        return "MyUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public String getName() {
        return name;
    }
}
