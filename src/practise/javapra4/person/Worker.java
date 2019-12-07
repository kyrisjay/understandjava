package practise.javapra4.person;

import practise.javapra4.person.Person;

public class Worker extends Person {
    private String unit;
    private int workAge;

    public Worker() {

    }

    public Worker(String name, String gender, int age, String nationality, String unit, int workAge) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.workAge = workAge;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public void show() {
        System.out.println("姓名：" + getName() + "，年纪：" + getGender() + "，年龄：" + getAge() + ",国籍：" + getNationality());
        System.out.println("单位：" + unit + ",工龄：" + workAge+"年");
    }

    public void work() {
        System.out.println("盖房子");
    }
}
