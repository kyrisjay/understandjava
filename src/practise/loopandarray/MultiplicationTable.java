package practise.loopandarray;

import java.util.Scanner;

/*
1.任意输入 n行 n列的乘法口诀表
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行列数");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
