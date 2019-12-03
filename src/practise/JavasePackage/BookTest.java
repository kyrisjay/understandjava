package practise.JavasePackage;

import practise.JavasePackage.Book;

public class BookTest {
    public static void main(String[] args){
        Book b=new Book();
        b.setPageNum(107);
        b.setTitle("Java快速入门");
        System.out.println(b);
    }
}
