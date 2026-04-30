import java.io.*;
import java.util.Scanner;
public class quiz8_2 {
  public static void main(String[] args) {
    FileInputStream f_in = null;
    File fname = new File("D:\\66CPE121Quiz07.txt");
    BufferedInputStream b_in = new BufferedInputStream(f_in);
    //data = b_in.read();
     try {
       f_in = new FileInputStream(fname);
       String c;
       System.out.println("Read from KB");
       System.out.println("===========================");
       do {
         System.out.print("Enter Data : ");
         c = new Scanner(System.in).nextLine();
         if (!(c.equals("*"))) f_in.write(c);
       } 
       while (!(c.equals("*")));
     } 
     catch (IOException e){
       System.out.println(e); 
     }
    System.out.println("Data are saved to File : ");
    System.out.println("=====================");
    try {
      f_in = new FileInputStream(fname);
      System.out.println("Read Data from File : " + fname);
      int c;
      while ((c = f_in.read()) != -1){
        System.out.println(c);
      }
    }
    catch (IOException e){
      System.out.println(e+"help");
    }
    System.out.println("=====================");
  }
}