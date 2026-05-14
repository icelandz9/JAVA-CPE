import java.util.Scanner;
import javax.swing.JOptionPane;
public class equation{
  public static void main(String[] args){
   double a,b,c,d,e,f,x,y,z;
   String data = JOptionPane.showInputDialog(null, "Enter a :");
   String data1 = JOptionPane.showInputDialog(null, "Enter b :");
   String data2 = JOptionPane.showInputDialog(null, "Enter c :");
   String data3 = JOptionPane.showInputDialog(null, "Enter d :");
   String data4 = JOptionPane.showInputDialog(null, "Enter e:");
   String data5 = JOptionPane.showInputDialog(null, "Enter f :");
   a = Integer.parseInt(data);
   b = Integer.parseInt(data1);
   c = Integer.parseInt(data2);
   d = Integer.parseInt(data3);
   e = Integer.parseInt(data4);
   f = Integer.parseInt(data5);
     z = (a*d)-(b*c);
     x = ((e*d)-(b*f))/z;
     y = ((a*f)-(e*c))/z;
     
    if(z!=0) {
    JOptionPane.showMessageDialog(null, "Enter a, b, c, d, e, f : "+ a +" "+ b +" "+ c +" "+ d +" "+ e +" "+ f);
    JOptionPane.showMessageDialog(null, "x is "+x+" and y is "+y);
    }
    else if(z==0) {
    System.out.println("Enter a, b, c, d, e, f : "+ a +" "+ b +" "+ c +" "+ d +" "+ e +" "+ f);
    System.out.println("The equation has no solution");
    }
  }
}