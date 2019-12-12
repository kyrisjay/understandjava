package practise.aggregate.pra2.Random;

import java.util.HashSet;
import java.util.Random;

public class random {
    public static void main(String[] args) {

        Random r = new Random();

        //创建Set集合 存储不重复的数
        HashSet<Integer> rs = new HashSet<>();

        while (rs.size() < 10) {
            int num = r.nextInt(20) + 1;
            rs.add(num);
        }

        for (Integer i : rs) {    //遍历集合打印
            System.out.print(i + " ");
        }
    }
}
