import java.util.Arrays;

public class Paskal {
    public static void main(String[] args) {
        //  число определяющее размер масива(количество строк) параметр программы
        int i;
        boolean a;

        if (args.length != 1) {
            System.out.println("Input 1 number");
            return;
        }

        a = checkString(args[0]);
        if (a != true ) {
            System.out.println("Char not number");
            return;
        }

        i = validParse(args[0]);


        int matrix [] [] = new int [i][];
        for (int v = 0; v<i; v++){
            matrix [v] = new int [v+1];
            matrix [v] [0] = 1;
            matrix [v] [v] = 1;
            if(v > 1){
            for(int k = 1; k < v; k++){
            matrix [v] [k] = matrix [v-1] [k -1] + matrix [v-1] [k];
            }
        }
        }
        for (int r = 0; r < matrix.length; r++) {
            System.out.println(Arrays.toString(matrix[r]));
        }
    }

    static int validParse(String num) {
        int n;
        try {
            n = Integer.parseInt(num);
        } catch (NumberFormatException exeption) {
            System.out.println(exeption.getMessage() + " Not number");
            n = 0;
        }
        return n;
    }

    public static boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
