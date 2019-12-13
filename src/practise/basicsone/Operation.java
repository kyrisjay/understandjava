package practise.basicsone;

public class Operation {
    //基本类型的运算）一家商场在举行打折促销，所有商品都进行8 折优惠。一
    //位程序员把这个逻辑写成：
    //short price = ...; // 先计算出原价
    //short realPrice = price * 8 / 10; //再计算出打折之后的价格
//    问：这段代码是否正确？
//    如果正确，假设price  为100 ，那计算之后的
//    realPrice值为多少？如果不正确，应该怎么改正？

    // 不正确，第二段代码会将值强制转换成int类型，与所接变量类型不匹配
    public static void main (String[] args){
        short price=100;
        short realPrice = (short)(price * 8 / 10);
    }
}
