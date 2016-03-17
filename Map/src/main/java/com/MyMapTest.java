package com;


public class MyMapTest {
    public static void main(String[] args) {
        MyMap<Integer, String> myMap = new MyMap<Integer, String>();
        myMap.put(1, "Eugene");
        myMap.put(56, "Oleg");//ключики - любые
        System.out.println(myMap);
        myMap.put(1, "Oleg_new_value");//должен перезатереть старое значение - Eugene, смотрите ключик 1 -> 8 строчка
        System.out.println(myMap);
        myMap.deletEntry(1);
        System.out.println(myMap);
    }
}
