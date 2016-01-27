package com;

public class Main {
    public static void main(String[] args) {
        Action action = new Action(Thing.COPY_BOOK);
        action.myAction();
        action.myNumber();
        action.myPrint();
    }
}
