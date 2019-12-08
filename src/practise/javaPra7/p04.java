package practise.javaPra7;
/*
4.找出能被5或6整除，但不能被两者同时整除的数
 */
public class p04 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                i++;
            }
            if (i % 5 == 0 || i % 6 == 0) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.print("\n");
                }
            }
        }
    }
}
