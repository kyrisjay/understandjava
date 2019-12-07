package practise.javapra4.vehicle;

public class Vehicle {
    private int wheels;
    private double weight;

    public Vehicle() {

    }

    public Vehicle(int wheels, double weight) {
        this.weight = weight;
        this.wheels = wheels;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void show() {
        System.out.println("轮子" + wheels + "个，" + "自重" + weight + "t");
    }
}
