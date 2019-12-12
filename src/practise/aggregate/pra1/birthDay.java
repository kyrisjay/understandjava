package practise.aggregate.pra1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class birthDay {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生日期，格式为yyyy-MM-dd：");
        String birthday1 = sc.next();
        //将字符串转换为date类型
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date birth = date.parse(birthday1);
        //获取当前日期
        Date nowDate = new Date();
        //转为毫秒值进行换算
        long nowSecond = nowDate.getTime();
        long birthSecond = birth.getTime();
        long second = nowSecond - birthSecond;
        System.out.println(second / 1000 / 60 / 60 / 24);
        System.out.println(second / 1000 / 60 / 60 );
    }
}
