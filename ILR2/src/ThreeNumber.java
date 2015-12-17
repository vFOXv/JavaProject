public class ThreeNumber {
    public static void main(String[] args) {
        int A, B, C, min;
        boolean a, b, c;

        if (args.length != 3) {
            System.out.println("Input 3 number");
            return;
        }
        a = checkString(args[0]);
        b = checkString(args[1]);
        c = checkString(args[2]);

        if (a != true || b != true || c != true) {
            System.out.println("Char not number");
            return;
        }

        A = validParse(args[0]);
        B = validParse(args[1]);
        C = validParse(args[2]);

        min = (A < B) ? (A < C ? A : C) : (B < C ? B : C);
        System.out.println("Min number " + min);
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
