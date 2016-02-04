package com;

public class MyCheckedException {
    public void myCheckedException() throws MyException {
        ObjectMan objectMan = new ObjectMan();

        if (objectMan.getOld() <= 0) {
            throw new MyException();
        }
    }

    public class MyException extends Exception {
    }
}
