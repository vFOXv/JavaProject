package MinMan;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {

    protected int [] fullArray(int size){
        Scaner scan = new Scaner();
        int line = scan.scaner();
        int array [] = new int [line];
        Random rand = new Random();
        for(int i = 0; i < array.length; i++ ){
            array [i] = rand.nextInt(100);
        }
        return array;
    }
}
