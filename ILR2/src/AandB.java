public class AandB {
    public static void main(String[] args) {
        int A, B;
        boolean a, b;
        if (args.length != 2) {
            System.out.println("Input 2 number");
            return;
        }
        a = checkString(args[0]);
        b = checkString(args[1]);

        if (a != true || b != true) {
            System.out.println("Char not number");
            return;
        }

        A = validParse(args[0]);
        B = validParse(args[1]);

        if (A != B) {
            A = A + B;
            B = A;
            System.out.println("A = " + A);
            System.out.println("B = " + B);
        } else {
            A = 0;
            B = 0;
            System.out.println("A = " + A);
            System.out.println("B = " + B);
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