package practise.aggregate.pra3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Student stu = new Student(1, "张三", "123456");
        TestQuestions tq = new TestQuestions("javaSE", "A");
        TestQuestions tq2 = new TestQuestions("javaEE", "C");
        TestQuestions tq3 = new TestQuestions("javaSE", "B");
        TestQuestions tq4 = new TestQuestions("SQL", "D");
        TestQuestions tq5 = new TestQuestions("HTML", "A");
        TestQuestions tq6 = new TestQuestions("C#", "B");
        TestQuestions tq7 = new TestQuestions("javaEE", "C");
        TestQuestions tq8 = new TestQuestions("HTML", "A");
        TestQuestions tq9 = new TestQuestions("SQL", "C");
        TestQuestions tq10 = new TestQuestions("C#", "D");

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入姓名：");
            String name = sc.next();
            if (Student.tm.containsKey(name)) {
                System.out.println("请输入密码：");
                if (Student.tm.get(name).equals(sc.next())) {
                    System.out.println("开始答题");
                    break;
                } else {
                    System.out.println("密码错误，请重新输入");
                }
            } else {
                System.out.println("姓名输入错误，请重新输入");
            }
        } while (true);
        double goal = stu.getScore();
        for (Object key : TestQuestions.hm.keySet()) {
            System.out.println(key);
            Scanner sc2 = new Scanner(System.in);
            String answer = sc2.next();
            if (TestQuestions.hm.get(key).equals(answer)) {
                goal += 10;
            }
        }
        System.out.println(stu.getName() + "得分是：" + goal);
    }
}