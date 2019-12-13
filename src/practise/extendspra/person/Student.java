package practise.extendspra.person;

public class Student extends Person {
    private String school;
    private int stuNumber;

    public Student() {

    }

    public Student(String name, String gender, int age, String nationality, String school, int stuNumber) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public void show() {
        System.out.println("姓名：" + getName() + "，年纪：" + getGender() + "，年龄：" + getAge() + ",国籍：" + getNationality());
        System.out.println("学校:" + school + ",学号:" + stuNumber);
    }

    public void work() {
        System.out.println("学习");
    }
}
