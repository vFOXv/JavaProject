import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
                if (i < 2) {
                    matrix[i][j] = (i + 1) * (j + 1);
                }else{
                    matrix[i][j] = (i + 1) * (j + 1) + (j + 1);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}


