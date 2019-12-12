package practise.aggregate.pra2.selectCourse;


import practise.aggregate.pra2.selectCourse.course;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Student {
    private int stuNumber;
    private String stuName;
    private Set<course> cr = new HashSet<>();

    public Student() {

    }

    public Student(int stuNumber, String stuName) {
        this.stuNumber = stuNumber;
        this.stuName = stuName;

    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void add(course a) {
        this.cr.add(a);
    }

    public void del(course a) {
        this.cr.remove(a);
    }

    public void search(int id) {
        Iterator<course> iterator = cr.iterator();

        while (iterator.hasNext()) {
            course cr2 = iterator.next();
            if (cr2.getId() == id) {
                System.out.println("学号：" + stuNumber + " 姓名：" + stuName + " "
                        + cr2.getId() + " " + cr2.getCouName() + " ");
                return;
            } else {
                System.out.println("不存在");
            }
        }
    }



    public void print() {
        Iterator<course> iterator = cr.iterator();
        System.out.print("学号：" + stuNumber + " 姓名：" + stuName + " ");
        System.out.print("所选课程如下：");
        while (iterator.hasNext()) {
            course cr1 = iterator.next();
            System.out.print(cr1.getId() + " " + cr1.getCouName() + " ");
        }
        System.out.println();
    }

}
