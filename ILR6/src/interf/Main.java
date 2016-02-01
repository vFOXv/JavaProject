package interf;

public class Main {
    public static void main(String[] args) {
        MyFly myFly = new MyFly();
        myFly.OutputName();
        myFly.SpeedFly(1000);
        myFly.WeightFly(200);
        myFly.OutputNumberPassengers(300);
        myFly.OutputSafety("conditionally saf");
    }
}
