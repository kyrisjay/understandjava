package practise.aggregate.pra1.stu;



import java.util.TreeMap;


public class Student {
    private String name;
    private int stuNum;
    private static int temp;
    static TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

    public Student() {

    }

    public Student(String name) {
        this.name = name;
        temp++;
        stuNum = temp;
        tm.put(stuNum, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public static int getTemp() {
        return temp;
    }

    public static void setTemp(int temp) {
        Student.temp = temp;
    }

    public static TreeMap<Integer, String> getTm() {
        return tm;
    }

    public static void setTm(TreeMap<Integer, String> tm) {
        Student.tm = tm;
    }

    void addStu(Student stu) {
        tm.put(stuNum, name);
    }
    void del(int num){
        tm.remove(stuNum);
    }

    void modify(int key,String stuName){
        tm.replace(stuNum,name,"val");
    }

    void search(int number){
        tm.get(stuNum);
    }

    public void print() {
        for (Object key : tm.keySet()) {
            System.out.println("学号：" + key + "学生姓名：" + tm.get(key));
        }
    }
}
