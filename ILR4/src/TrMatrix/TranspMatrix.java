package TrMatrix;

public class TranspMatrix {
    public static void main(String[] args) {
        WorkClass job = new WorkClass();
        job.dialogue();
        int myMatrix [] [] = job.build();
        System.out.println("");
        job.turn(myMatrix);
    }
}
