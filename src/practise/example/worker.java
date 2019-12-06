package practise.example;

public class worker {
    private String name;
    private int number;
    private double salary;

    public worker(String name,int number,double salary) {
        this.name=name;
        this.number = number;
        this.salary=salary;
    }

    public worker(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void  show(){
        System.out.println("姓名：" + name + "，工号：" + number + ",工资：" + salary);
    }
}
