package practise.javaPra8;

/*
定义一个数组,数组成员10个,找出数组中最大数连同下标一起输出
 */
public class p04 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
