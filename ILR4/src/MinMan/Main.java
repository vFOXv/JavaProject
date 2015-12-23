package MinMan;

public class Main {

    static int min, max, temp;

    public static void main(String[] args) {
        Scaner scan = new Scaner();
        RandomArray myArray = new RandomArray();
        int matrix[] = myArray.fullArray(scan.line);
        for (int i = 0; i < matrix.length ; i++) {
            System.out.print(matrix[i] + " ");
        }

        for (int i = 0; i < matrix.length - 1; i++) {
            if (matrix[i] < matrix[i + 1]) {
                min = i;
            }else{

            }
            if (matrix[i] > matrix[i + 1]) {
                max = i;
            }
        }
        temp = matrix[min];
        matrix[min] = matrix[max];
        matrix[max] = temp;
        System.out.println(" ");
        for (int i = 0; i < matrix.length ; i++) {
            System.out.print(matrix[i] + " ");
        }
    }
}
