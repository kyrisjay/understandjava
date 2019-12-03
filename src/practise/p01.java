package practise;

public class p01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;

        a = b++;// b++先运算后自增即b,b+1  so a=b,b=b+1  即a=10,b=11,c=10
        c = --a;//--a即a-1; c=a-1 a=9,b=11,c=9
        b = ++a;// b=a+1 即 a=9,b=10,c=9
        a = c--;//a=c,c=c-1  ; a=9,b=10,c=8
        System.out.println("a=" + a + ",b=" + b + ",c=" + c);
    }
}
