package practise.JavasePackage;

public class test {
    static {
        int x = 5;
    }
    static int x, y;
    public static void main(String[] args){
        x--;
        myMethod();
        System.out.println(x + y++ + x);
    }
    public static void myMethod(){
        y = x++ + ++x;
    }
}
//2   static int x 将x的值初始化为0