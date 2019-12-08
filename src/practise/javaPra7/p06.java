package practise.javaPra7;

import java.util.Random;
import java.util.Scanner;

/*
30以内的随机数,请输入任意一个数,循环10次,求这个数在随机数范围内出现的次数
 */
public class p06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个30以内的数");
        int num = sc.nextInt();
        int count = 0;
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            if (num == r.nextInt(30)) {
                count++;
            }
        }
        System.out.println("该数出现了" + count + "次");
    }
}
