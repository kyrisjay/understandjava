package practise.aggregate.pra1.stu;

public class StuTest {
    public static void main(String[] args) {
        Student stu = new Student("张三");
        Student stu1 = new Student("李四");
        Student stu2 = new Student("王五");

        stu.addStu(stu);
        stu1.addStu(stu1);
        stu2.addStu(stu2);
        stu.print();

        System.out.println("--------------------");
        stu.del(1);
        stu.print();

        System.out.println("--------------------");
        stu1.modify(2,"李四");
        stu.print();

        System.out.println("--------------------");
        stu2.search(3);
        stu.print();
    }
}
