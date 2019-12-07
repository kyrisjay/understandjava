package practise.javapra4.vehicle;

import practise.javapra4.vehicle.Vehicle;

public class Car extends Vehicle {
    private int loader;

    public Car() {

    }

    public Car(int wheels, double weight,int loader) {
        super(wheels,weight);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    public void show() {
        System.out.println("轮子" + getWheels() + "个，" + "自重" + getWeight() + "t");
        System.out.println("载客人数：" + loader + "人");
    }
}
