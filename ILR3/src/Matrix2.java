import java.util.Arrays;

public class Matrix2 {
    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        for (int j = 0; j < matrix.length; j++) {
            matrix [0][j] = j+1;
            for (int i = 1; i < matrix.length; i++) {
                matrix[i][j] = matrix [i-1] [j] * 2;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}

