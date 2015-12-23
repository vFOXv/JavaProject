package TrMatrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WorkClass {
    int sizeLine;
    int sizeColumn;
    //int myMatrix[][] = new int[getSizeLine()][getSizeColumn()];

    public int getSizeLine() {
        return sizeLine;
    }

    public void setSizeLine(int sizeLine) {
        this.sizeLine = sizeLine;
    }

    public int getSizeColumn() {
        return sizeColumn;
    }

    public void setSizeColumn(int sizeColumn) {
        this.sizeColumn = sizeColumn;
    }

    protected void dialogue() {

        System.out.println("Input size matrix");
        System.out.println("Number line");
        setSizeLine(scan());
        System.out.println("Number column");
        setSizeColumn(scan());
    }

    protected int scan() {

        Scanner myScan = new Scanner(System.in);
        int size = myScan.nextInt();
        return size;
    }

    protected int[][] build() {

        int myMatrix[][] = new int[getSizeLine()][getSizeColumn()];
        Random rand = new Random();
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                myMatrix[i][j] = rand.nextInt(100);
            }
        }
        for (int i = 0; i < myMatrix.length; i++) {
            System.out.println(Arrays.toString(myMatrix[i]));
        }
        return myMatrix;
    }

    protected void turn(int myMatrix[][]) {
        int turnMatrix[][] = new int[getSizeColumn()][getSizeLine()];
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                turnMatrix[i][j] = myMatrix[j][i];
            }
        }
        for (int i = 0; i < turnMatrix.length; i++) {
            System.out.println(Arrays.toString(myMatrix[i]));
        }
    }
}