package practise.extendspra;

public class A {

    int i = 1;

    void print() {
        System.out.println(i);
    }
}
    class B extends A {
        int i= 2;

        public static void main(String[] args) {
            B b = new B();
            b.print();
        }
    }

    //结果为1






