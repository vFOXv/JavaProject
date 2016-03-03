package com;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Maim {
    public static void main(String[] args) {

        WWW www = new WWW();
        try {
            www.absolutPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            www.workMyFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
