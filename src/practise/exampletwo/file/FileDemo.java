package practise.exampletwo.file;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.imageio.stream.ImageInputStream;
import java.io.File;
import java.io.FilenameFilter;

public class FileDemo {
    public static void getFile(File file) {
        if (file.isDirectory()) {
            File[] file1 = file.listFiles();
            for (int i = 0; i < file1.length; i++) {
                getFile(file1[i]);
            }
        } else {
            if (file.toString().endsWith(".docx") || file.toString().endsWith(".doc")) {
                System.out.println(file.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {

        File file = new File("/Users/edz/Downloads");
        getFile(file);

    }
}