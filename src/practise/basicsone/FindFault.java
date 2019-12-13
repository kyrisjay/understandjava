package practise.basicsone;
//void public main(){
//
//        int i=1,j;
//
//        float f1=0.1;
//        float f2=123;
//        long  l1=123141L,l2=88888888888;
//        double d1=2e20,d2=124;
//        byte b1=1,b2=2,b3=129;
//        j=j+10;
//        i=i/10;
//        i=i*0.1;
//
//        char c1='a',c2=125;
//
//        byte b=b1-b2;
//
//        char c=c1+c2-1;
//        float f3=f1+f2;
//
//        float f4=f1+f2*0.1;
//
//        double d=d1*i+j;
//
//        float f=(float)(d1*5+d2);

public class FindFault {
    public static void  main(String[] args){   //1 public static void  main(String[] args)

        int i=1,j=1;  //没有给j赋初始值

        float f1=0.1f;  //float 类型后面需要加f  正确为f1=0.1f
        float f2=123f;   //float 类型后面需要加f  正确为f2=123f
        long  l1=123141L,l2=88888888888L;//l2正确写法l2=88888888888L
        double d1=2e20,d2=124;
        byte b1=1,b2=2;
        int b3=129;//b3数值超标  int b3=123
        j=j+10;
        i=i/10;
        i=(int)(i*0.1);//i为int 类型

        char c1='a',c2=125;

        byte b=(byte)(b1-b2);//会强制转换成int类型，所以要转换类型

        char c=(char)(c1+c2-1);//同上
        float f3=f1+f2;

        float f4=(float)(f1+f2*0.1);//不加转换  会强制转换成double类型

        double d=d1*i+j;

        float f=(float)(d1*5+d2);

        System.out.println("b="+b+",c="+c+",f3="+f3+",f4="+f4+",d="+d+",f="+f);
    }
}
