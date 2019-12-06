package practise.example;

public class manager extends worker {
    private double bonus;

    public manager(String name, int number, double salary, double bonus) {
        super(name, number, salary);
        this.bonus = bonus;

    }

    public void show() {
        System.out.println("姓名：" + getName() + "，工号：" + getNumber() + ",工资：" + getSalary() + "奖金：" + bonus);
    }

}
