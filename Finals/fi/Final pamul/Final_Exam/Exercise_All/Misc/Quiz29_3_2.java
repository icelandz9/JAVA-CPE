package Final_Exam.Exercise_All.Misc;

import java.io.*;
import java.util.Scanner;

public class Quiz29_3_2 {
    public static void main(String[] args) {
        String fname = "c:\\66CPE121Quiz07.txt";
        FileWriter f_write = null;
        try {
            f_write = new FileWriter(fname);
            String c;
            System.out.println("Read from KB");
            System.out.println("===========================");
            do {
                System.out.print("Enter Data : ");
                c = new Scanner(System.in).nextLine();
                if (!(c.equals("*")))
                    f_write.write(c);
            } while (!(c.equals("*")));
        } catch (IOException e) {
            System.out.println(e);
            c.close();
        } finally {
            try {
                if (f_write != null)
                    f_write.close();
                System.out.println("Data are saved to File : \n" + fname);
                System.out.println("===========================");
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        FileReader f_read = null;
        try {
            f_read = new FileReader(fname);
            System.out.println("Read Data from File : \n" + fname);
            System.out.println("===========================");
            int c;
            while ((c = f_read.read()) != -1) {
                System.out.print(c);
                System.out.print("\t");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (f_read != null)
                    f_read.close();
                System.out.println("===========================");
            } catch (IOException e) {
                System.out.println(e);

            }
        }
    }
}
