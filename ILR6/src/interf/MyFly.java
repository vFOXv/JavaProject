package interf;

public class MyFly implements Fly {
    @Override
    public void OutputName() {
        System.out.println("Boeing 757 airplane.");
    }

    @Override
    public int SpeedFly(int speed) {
        System.out.println("Speed fly = " + speed + " kilometre/hour.");
        return 0;
    }

    @Override
    public int WeightFly(int weight) {
        System.out.println("Weight fly = " + weight + " ton.");
        return 0;
    }

    @Override
    public int OutputNumberPassengers(int numberPassengers) {
        System.out.println("Number passengers = " + numberPassengers + ".");
        return 0;
    }

    @Override
    public String OutputSafety(String safety) {
        System.out.println("Safety fly " + safety + ".");
        return null;
    }
}
