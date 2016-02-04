package com;

import java.util.Scanner;

public class ObjectMan {

    static int old;
    static String name;

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void myScan() throws MyCheckedException.MyException {
        Scanner scanner = new Scanner(System.in);
        MyCheckedException myCheckedException = new MyCheckedException();
        MyUncheckedException myUncheckedException = new MyUncheckedException();

        System.out.println("Output Name Man.");
        setName(scanner.next());
        myUncheckedException.myUncheckedException();

        System.out.println("Output Old Man.");
        setOld(scanner.nextInt());
        myCheckedException.myCheckedException();
    }
}
