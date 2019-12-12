package practise.aggregate.pra1;

import java.util.Scanner;

public class mathRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始数");
        int start = sc.nextInt();
        System.out.println("请输入结束数");
        int end = sc.nextInt();
        System.out.println("请输入要获取的随机数的个数：");
        int num = sc.nextInt();

        if ((end - start + 1) < num) {
            System.out.print("随机数范围小于随机数个数，输入不合法，请重新输入");
        } else {
            for (int i = 0; i < num; i++) {
                int number = (int) (Math.random() * (end - start + 1) + start);
                System.out.print(number + ",");
            }
        }
    }
}