package practise.exampletwo.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class read {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a");
        FileOutputStream fos = new FileOutputStream("b");

        int len = 0;
        byte[] b = new byte[fis.available()];
        while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);
            fos.flush();
        }
        fis.close();
    }
}
