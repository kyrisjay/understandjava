package practise.JavaPra3;

import java.util.Scanner;

public class p2 {
    //1.编写Java程序，实现判断变量x是奇数还是偶数。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sc.nextInt();

        if (x % 2 == 0){
            System.out.println("为偶数");
        }else{
            System.out.println("为奇数");
        }
    }
}
