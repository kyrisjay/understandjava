package practise.JavasePackage.book;

import practise.JavasePackage.book.Book;

public class BookTest {
    public static void main(String[] args){
        Book b=new Book();
        b.setPageNum(107);
        b.setTitle("Java快速入门");
        System.out.println(b);
    }
}
