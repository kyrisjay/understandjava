package practise.javapra4.person;

import practise.javapra4.person.Student;

public class StudentLeader extends Student {
    private String job;

    public StudentLeader() {

    }

    public StudentLeader(String name, String gender, int age, String nationality, String school, int stuNumber, String job) {
        super(name, gender, age, nationality, school, stuNumber);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void show() {
        System.out.println("姓名：" + getName() + "，年纪：" + getGender() + "，年龄：" + getAge() + ",国籍：" + getNationality());
        System.out.println("学校:" + getSchool() + ",学号:" + getStuNumber());
        System.out.println("职位：" + job);
    }

    public void meeting() {
        System.out.println("开会");
    }
}
