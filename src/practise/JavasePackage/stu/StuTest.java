package practise.JavasePackage.stu;

import java.util.Scanner;

public class StuTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级个数");
        int n = sc.nextInt();
        System.out.println("请输入每个班级的人数");
        int m = sc.nextInt();

        double totalScore = 0.0;
        double avgScore = 0.0;

        double[] sag = new double[n];
        gradeScore[] rs = new gradeScore[n];

        Student[][] students = new Student[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Student stu = new Student();
                System.out.println("请输入第" + (i + 1) + "个班级的第" + (j + 1) + "个学生的学号");
                int num = sc.nextInt();
                stu.setStuNumber(num);
                System.out.println("请输入第" + (i + 1) + "个班级的第" + (j + 1) + "个学生的姓名");
                String name = sc.next();
                stu.setStuName(name);
                System.out.println("请输入第" + (i + 1) + "个班级的第" + (j + 1) + "个学生的年龄");
                int age = sc.nextInt();
                stu.setAge(age);
                System.out.println("请输入第" + (i + 1) + "个班级的第" + (j + 1) + "个学生的班级");
                int grade = sc.nextInt();
                stu.setGradeClass(grade);
                System.out.println("请输入第" + (i + 1) + "个班级的第" + (j + 1) + "个学生的分数");
                double score = sc.nextDouble();
                stu.setScore(score);

                totalScore += score;
                students[i][j] = stu;
            }
            gradeScore gs = new gradeScore();
            gs.setGradeClass(students[i][0].getGradeClass());

            avgScore = totalScore / m;
            sag[i] = avgScore;

            gs.setAvgScore(avgScore);
            totalScore = 0.0;
            rs[i] = gs;
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                for (int j = 0; j < m - k - 1; j++) {
                    if (students[i][j].getAge() < students[i][j + 1].getAge()) {
                        Student s = students[i][j];
                        students[i][j] = students[i][j + 1];
                        students[i][j + 1] = s;
                    }
                }
            }
            for (int j = 0; j < m; j++) {
                System.out.println("第" + (i + 1) + "个班级按照年龄降序排列" + students[i][j].toString());
            }
        }

        System.out.println("--------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sag[j] > sag[j + 1]) {
                    double score = sag[j];
                    sag[j] = sag[j + 1];
                    sag[j + 1] = score;
                }
            }
        }
        for (int i = 0; i < sag.length; i++) {
            System.out.println(sag[i]);
        }
    }

}