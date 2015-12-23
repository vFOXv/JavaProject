package MinMan;

import java.util.Scanner;

public class Scaner {

    static int line;

    protected int scaner(){
        System.out.println("Input line array");
        Scanner myScan = new Scanner(System.in);
        line = myScan.nextInt();
        return line;
    }
}
