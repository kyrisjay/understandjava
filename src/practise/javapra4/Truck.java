package practise.javapra4;

public class Truck extends Car{
    private double payload;
    public Truck(){

    }
    public Truck(int wheels, double weight,int loader,double payload){
        super(wheels,weight,loader);
        this.payload=payload;
    }
    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }
   public void show(){
       System.out.println("轮子"+getWheels()+"个，"+"自重"+getWeight()+"t");
       System.out.println("载客人数："+getLoader()+"人");
       System.out.println("载重量:"+payload+"t");
    }
}
