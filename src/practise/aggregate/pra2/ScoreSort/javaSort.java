package practise.aggregate.pra2.ScoreSort;

import java.util.*;

public class javaSort {


    public static void main(String[] args) {
        TreeSet<Student> s = new TreeSet<>();
        for (int i = 0; i < 40; i++) {
            Student stu = new Student(180201 + i, "同学" + (10 + i), (int) (Math.random() * 51 + 50));
            s.add(stu);
        }
        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
