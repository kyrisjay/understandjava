package practise.JavasePackage.book;

public class Book {
    private  String title;
    private  int pageNum;

    public Book(){

    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public int getPageNum(){
        return pageNum;
    }

    public void setPageNum(int pageNum){
        if(pageNum>200){
            this.pageNum=pageNum;
        }else{
            System.out.println("输入错误");
            this.pageNum=200;
        }
    }

    @Override
    public String toString() {
        return "Book [title="+title+",pageNum="+pageNum+"]";
    }
}
