package com;

public class Main {
    public static void main(String[] args) {
        ObjectMan myObjectMan = new ObjectMan();
        try {
            myObjectMan.myScan();
        } catch (MyCheckedException.MyException e) {
            //e.printStackTrace();
            System.out.println("Old < or = 0!!!");
        } catch (MyUncheckedException.MyRuntimeException ee) {
            ee.printStackTrace();
            System.out.println(" In Name is Number!!!");
        }
    }

}
