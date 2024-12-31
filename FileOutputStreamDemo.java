package ioprograms;
import java.io.*;
public class FileInputStreamDemo {
   public static void main(String[] args) throws IOException{
       FileOutputStreamDemo fis =  new FileInputStreamDemo("file1.txt");
       BufferedInputStream fis = new FileInputStreamDemo("file1.txt");
       int size = bis.available();
       byte[] buffer = new byte[size];
       bis.read(buffer);
       String s = new String(buffer);
       System.out.println(s);
       fis.close();
   }
}