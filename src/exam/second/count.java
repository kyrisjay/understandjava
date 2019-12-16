package exam.second;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
使用Map集合统计字符串中“123, 456, 789, 123, 456”中每个整数出现的次数并打印出来
 */
public class count {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        String str = "123, 456, 789, 123, 456";

        String[] arr = str.split(",");
        for (int i = 0; i < arr.length; i++) {
            Integer count = m.get(arr[i]);
            if (count == null) {
                m.put(arr[i], 1);
            } else {
                m.put(arr[i], count + 1);
            }
        }

        for (int i = 0; i < m.size(); i++) {
            System.out.print(arr[i] + "(" + m.get(arr[i]) + "次)");
        }

    }
}
