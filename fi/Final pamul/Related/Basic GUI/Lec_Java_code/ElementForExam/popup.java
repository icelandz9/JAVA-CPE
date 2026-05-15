import javax.swing.JOptionPane;
import java.lang.Math;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Calendar;
public class popup
{
   public static void main(String[] args)
  {
     //object
  Scanner sn = new Scanner(System.in);
  Random rand = new Random();
  int H = rand.nextInt(11);
  int F = sn.nextInt();
  //show
  JOptionPane.showMessageDialog(null,"Hello world");
  JOptionPane.showMessageDialog(null,"Error","Error Message",JOptionPane.ERROR_MESSAGE);
  JOptionPane.showMessageDialog(null,"Press OK to continue","Inforation Message",JOptionPane.INFORMATION_MESSAGE);
  JOptionPane.showMessageDialog(null,"Press OK to continue","Plain Message",JOptionPane.PLAIN_MESSAGE);
  JOptionPane.showMessageDialog(null,"Would you like to continue","Question Message",JOptionPane.QUESTION_MESSAGE);
  JOptionPane.showMessageDialog(null,"Variabel not used","Warning",JOptionPane.WARNING_MESSAGE);
  //input
  String data1 = JOptionPane.showInputDialog(null,"Input Number","Plain Message",JOptionPane.PLAIN_MESSAGE);
  String data2 = JOptionPane.showInputDialog(null,"Try Again","Error Message",JOptionPane.ERROR_MESSAGE);
  String data3 = JOptionPane.showInputDialog(null,"Input Number","Inforation Message",JOptionPane.INFORMATION_MESSAGE);
  String data4 = JOptionPane.showInputDialog(null,"What is your name?","Question Message",JOptionPane.QUESTION_MESSAGE);
  String data5 = JOptionPane.showInputDialog(null,"Are you sure to leave program","Warning",JOptionPane.WARNING_MESSAGE);
  //String to number
  int a = Integer.parseInt(data1);
  double b = Double.parseDouble(data2);
  //Number to String
  String c = Integer.toString(a);
  String d = Double.toString(b);
  //casting
  int e = (int)b;
  double f = (double)a;
  //Math
  int x=0,y=0;
  double z=0.0;
  Math.pow(x,y);
  Math.sqrt(x);
  Math.abs(x);
  Math.round(z);//ปัดเศษทศนิยมปัดขึ้นปัดลง
  Math.ceil(z);//ปัดขึ้นอย่างเดียว
  Math.floor(z);//ปัดทิ้ง
  double pi = Math.PI;
  Math.max(x,y);
  Math.min(x,y);
  double n = Math.random();
  Math.log(x);
  Math.exp(x);
  Math.sin(x);
  Math.cos(x);
  Math.tan(x);
  Math.random();
  //calender
  Calendar calen = Calendar.getInstance();
}
}