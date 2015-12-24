package MinMan;

public class Main {

    static int min, minIndex, maxIndex, max, temp;

    public static void main(String[] args) {
        Scaner scan = new Scaner();
        RandomArray myArray = new RandomArray();
        int matrix[] = myArray.fullArray(scan.line);
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }
        min = matrix[0];
        max = matrix[0];
        for (int i = 1; i < matrix.length; i++) {
            if (min > matrix[i]) {
                min = matrix[i];
                minIndex = i;
            }
            if (max < matrix[i]) {
                max = matrix[i];
                maxIndex = i;
            }
        }
        temp = matrix[minIndex];

        matrix[minIndex] = matrix[maxIndex];
        matrix[maxIndex] = temp;
        System.out.println(" ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }
    }
}
