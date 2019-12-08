package practise.javaPra8;

import java.util.Random;

public class p09 {
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
