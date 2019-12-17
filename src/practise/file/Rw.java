package practise.file;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
/*
将集合用字节流或者字符流写入doc文件
 */
public class Rw {
    public static void main(String[] args) throws IOException {
        ArrayList arr = new ArrayList(Arrays.asList("afhsf", "123", "555"));
        File f = new File("io.doc");
        if (!f.exists()) {
            f.createNewFile();
        }

        //BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));
        int count = 0;
//        while (count < arr.size()) {
//            byte[] bytes = String.valueOf(arr.get(count)).getBytes();
//            bos.write(bytes);
//            count++;
//            bos.flush();
//        }
//        bos.close();

        BufferedWriter bw=new BufferedWriter(new FileWriter(f));

//        while (count<arr.size()){
//            arr.get((count++));
//        }
        bw.write(String.valueOf(arr));
        bw.flush();
        bw.close();
    }
}