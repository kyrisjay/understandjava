package practise.javaPra7;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
1.从键盘输入一个班5个学生的分数，求和并输出
 */
public class p01 {
    public static void main(String[] args) {
        double totalScore = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int sum = sc.nextInt();
        for (int i = 0; i < sum; i++) {
            System.out.println("第" + (i + 1) + "个学生分数");
            double score = sc.nextDouble();
            totalScore += score;

        }
        System.out.println("总分为：" + totalScore + "分");
    }
}
