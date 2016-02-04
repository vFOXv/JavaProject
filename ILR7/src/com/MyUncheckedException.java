package com;

public class MyUncheckedException {
    public void myUncheckedException() throws MyRuntimeException {
        ObjectMan objectMan = new ObjectMan();

        if(!objectMan.getName().matches("^[^0-9]*$")){
            throw new MyRuntimeException();
        }
    }

    public class MyRuntimeException extends RuntimeException {
    }
}