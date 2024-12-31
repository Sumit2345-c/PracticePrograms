package ioprograms;
import java.io.*;
public class DataInputStreamDemo {
   public static void main(String[] args) throws IOException{
       FileOutputStreamDemo fis =  new FileInputStreamDemo("file1.txt");
       DataInputStream fis = new DataInputStreamDemo("file1.txt");
       int n = dis.readInt();
       System.out.println(n);
       String s = dis.readUTF();
       System.out.println(s);
       double d = dis.readDouble();
       System.out.println(d);
       dis.close();
       fis.close();
   }
}