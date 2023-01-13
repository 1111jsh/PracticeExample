package ioexam;

import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class FileInputStreamExample {
    public static void main(String args[])
    {
        try {
            FileInputStream fileInput = new FileInputStream("codestates.txt");
            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
            int i = 0;
            while ((i = bufferedInput.read()) != -1) {
                System.out.print((char)i);
            }
            fileInput.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}