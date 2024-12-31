package ioprograms;
import java.io.*;
public class FileReaderDemo {
   public static void main(String[] args) throws IOException{
       FileReader fw =  new FileReader("file3.txt");
       int n;
       while (n = fr.read()) != -1)
           System.out.println((char)n);
        fr.close();
        System.out.println();
        char c = 'p';
        System.out.println((int)c);
       
   }
}