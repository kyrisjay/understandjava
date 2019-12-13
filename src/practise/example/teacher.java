package practise.example;

public abstract class teacher {
    private String name;
    private int age;

    public teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void teach();

    @Override
    public String toString() {
        return "teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 杨辉三角
     */
    public static class e01 {
        //    public static void main(String[] args) {
    //        int rows = 10;
    //
    //        for (int i = 0; i < rows; i++) {
    //            int number = 1;
    //            // 打印空格字符串
    //            System.out.format("%" + (rows - i) * 2 + "s", "");
    //            for (int j = 0; j <= i; j++) {
    //                System.out.format("%4d", number);
    //                number = number * (i - j) / (j + 1);
    //            }
    //            System.out.println();
    //        }
    //    }
        public static void main(String[] args) {
            int[][] arr = new int[10][10];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (j == 0 || j == i-1) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                    }
                    System.out.print(arr[i][j]+" ");

                }
                System.out.println();
            }

        }

    }
}
