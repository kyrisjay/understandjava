package practise.javasePackage.car;

public class Car {
    private String model;
    private String name;
    private String color;
    private String date;
    private String mfrs;

    public Car(String model,String name,String color,String date,String mfrs){
        this.model=model;
        this.name=name;
        this.color=color;
        this.date=date;
        this.mfrs=mfrs;
        }

    public Car() {

    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }

    public String getName(){
        return name;
    }
    public  void  setName(String name){
        this.name=name;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date=date;
    }

    public String getMfrs(){
        return mfrs;
    }
    public void setMfrs(String mfrs){
        this.mfrs=mfrs;
    }

    @Override
    public String toString() {
        return "Car [model="+model+",name="+name+",color="+color+",date="+date+",mfrs="+mfrs+"]";
    }
}
