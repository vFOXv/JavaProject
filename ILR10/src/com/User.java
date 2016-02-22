package com;

import java.lang.reflect.InvocationTargetException;

public class User {

    public static void main(String[] args) {

        MyUser myUser = new MyUser("Sam", 20);
        System.out.println(myUser.toString());

        Refleksi refleksi = new Refleksi();

        try {
            refleksi.refl();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }



}
