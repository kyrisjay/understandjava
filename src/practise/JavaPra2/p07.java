package practise.JavaPra2;


//已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序
public class p07 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int c = a;
            a = b;
            b = c;


        a = a + b;
        b = a - b;
        a = a - b;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;


        System.out.println("b=" + b + ",a=" + a);
    }

}
