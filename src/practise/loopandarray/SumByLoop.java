package practise.loopandarray;

import java.util.Scanner;

public class SumByLoop {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            double sum = 0;
            double avg = 0;
            for (int j = 0; j < 10; j++) {
                System.out.println("请输入第" + (i + 1) + "个班级第" + (j + 1) + "个学生的分数");
                double score = sc.nextDouble();

                sum += score;
            }
            avg = sum / 10;
            System.out.println((i + 1) + "班的总分:" + sum);
            System.out.println((i + 1) + "班的平均分:" + avg);
        }
    }
}
