package practise.aggregate.pra2.selectCourse;


public class ListTest {

    public static void main(String[] args) {
        Student stu = new Student(1, "张三");
        course cr = new course(9527, "java基础");
        course cr1 = new course(9768, "C#");
        course cr2 = new course(9898, "javaScrip");
        stu.add(cr);
        stu.add(cr1);
        stu.add(cr2);
        stu.print();


        Student stu1=new Student(2, "李四");
        stu1.add(cr);
        stu1.add(cr1);
        stu1.print();

       stu.search(9768);


        stu.del(cr);
        stu.print();


    }
}

