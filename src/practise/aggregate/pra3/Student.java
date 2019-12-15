package practise.aggregate.pra3;

import java.util.TreeMap;

public class Student {
    private int stuNum;
    private String name;
    private String passWord;
    private double score;
    static TreeMap<String, String> tm=new TreeMap<>();

    public Student(){

    }
    public Student(int stuNum, String name, String passWord) {
        this.stuNum = stuNum;
        this.name = name;
        this.passWord = passWord;
        tm.put(name,passWord);
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "学号："+stuNum+"姓名："+name+"学生成绩："+score;
    }
}
