package practise.loopandarray;

import java.util.Random;
/*
 有30个0~9之间的数字，分别统计0~9这10个数字分别出现了多少次
 */
public class Count {
    public static void main(String[] args) {
        int[] a = new int[30];
        int[] b = new int[10];
        Random r = new Random();
        for (int i = 1; i < a.length; i++) {
            a[i] = r.nextInt(10);
            System.out.print(a[i] + ",");
        }
        for (int i = 0; i < a.length; i++) {
            b[a[i]]++;
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + "出现了" + b[i] + "次");
        }
    }
}
