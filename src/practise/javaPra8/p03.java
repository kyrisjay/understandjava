package practise.javaPra8;

import java.util.Scanner;
import java.util.jar.JarOutputStream;
/*
打印出下面的图案
54321
5432
543
54
5
 */
public class p03 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}