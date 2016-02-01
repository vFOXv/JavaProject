package car;

public class Car implements Machine {
    final int maxSpeed = 200;
    final int minSpeed = 0;
    final int minNumbePassengers = 0;
    final int maxNumbePassengers = 20;
    public String name;
    public int speed;

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void OutputNameCar() {
        System.out.println("Name Car " + getName() + ".");
    }

    @Override
    public void OutputSpeedCar() {
        System.out.println("Speed Car " + getSpeed() + " km/hour.");
    }


}
