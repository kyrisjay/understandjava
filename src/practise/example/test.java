package practise.example;

public class test {
    public static void main(String[] args) {
        manager m = new manager("李四", 12, 5000.0, 2000.0);
        m.show();
        worker w = new worker("张三", 11, 3000.0);
        w.show();
    }
}
