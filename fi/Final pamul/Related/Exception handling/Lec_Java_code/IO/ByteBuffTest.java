import java.io.*;
import java.util.Scanner;
public class ByteBuffTest {
public static void main(String[] args) {
String fname =("e:\\ByteBuffData.txt");
FileOutputStream f_out = null;
BufferedOutputStream b_out = null;
try {
f_out = new FileOutputStream(fname);
b_out = new BufferedOutputStream(f_out);
int c;
System.out.println("Read from KB");
System.out.println("===========================");
do {
System.out.print("Enter Data : ");
c = new Scanner(System.in).nextInt();
if (c != 0) b_out.write(c);
} while (c != 0);
}
catch (IOException e){
System.out.println(e); }
finally {
try {
if (b_out != null)
b_out.close();
System.out.println("Data are saved to File : \n" + fname);
System.out.println("==========================="); }
catch (IOException e){
System.out.println(e); }
}
FileInputStream f_in = null;
BufferedInputStream b_in = null;
try {
f_in = new FileInputStream(fname);
b_in = new BufferedInputStream(f_in);
System.out.println("Read Data from File : \n" + fname);
System.out.println("===========================");
int c;
while ((c = b_in.read()) != -1)
System.out.printf("%-3d",c);
System.out.println();
}
catch (IOException e){
System.out.println(e);
}
finally {
try {
if (b_in != null)
b_in.close();
System.out.println("===========================");
}
catch (IOException e) {
System.out.println(e);
}
}
}
}