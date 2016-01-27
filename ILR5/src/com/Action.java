package com;

public class Action {
    Thing thing;

    public Action(Thing thing) {
        this.thing = thing;
    }

    public void myAction(){
        switch(thing){
            case BOOK:
                System.out.println("Read book!");
                break;
            case COPY_BOOK:
                System.out.println("Write in copy-book!");
                break;
            case PEN:
                System.out.println("Write this a pen!");
                break;
            case PENCIL:
                System.out.println("Drew this a pencil!");
        }
    }
    public void myPrint(){
        System.out.println();
        for(Thing myThing : Thing.values()){
            System.out.println(myThing.toString());
        }
    }
    public void myNumber(){
        System.out.println("Number this object " + thing.ordinal());
    }
}
