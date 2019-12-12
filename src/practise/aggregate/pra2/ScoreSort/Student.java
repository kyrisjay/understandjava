package practise.aggregate.pra2.ScoreSort;

import java.util.*;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "学号：" + id + ",姓名：" + name + ",成绩：" + score;
    }


    @Override
    public int compareTo(Student o) {
        int num = o.getScore() - this.getScore();
        int num1 = num == 0 ? o.getId() - this.getId() : num;
        int num2 = num == 0 ? o.getName().length() - this.getName().length() : num1;

        return num2;
    }
}
