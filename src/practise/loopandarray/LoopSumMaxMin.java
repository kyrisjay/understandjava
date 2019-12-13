package practise.loopandarray;

import java.util.Scanner;

/*
声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分、最高分和最低分
 */
public class LoopSumMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[8];
        double sum = 0;
        double avg;
        double max = arr[0], min = arr[0];

        for (int i = 0; i < 8; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
            double score = sc.nextDouble();

            arr[i] = score;
            sum += score;

            min = arr[0];
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        avg = sum / 8;
        System.out.println("总分为：" + sum + "分，平均分为：" + avg + "分");
        System.out.println("最高分：" + max + "分,最低分：" + min + "分");
    }
}
