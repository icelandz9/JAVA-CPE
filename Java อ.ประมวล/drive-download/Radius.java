import java.util.Scanner;
import javax.swing.JOptionPane;

public class Radius {
    public static void main(String[] args) {
      
      double area, radius, volume, length;
      
      Scanner sc = new Scanner(System.in);
      
              
      
     System.out.print("Input radius: ");
     radius = sc.nextDouble();
     System.out.print("Input Length: ");
     length = sc.nextDouble();
      
      area = (radius * radius) * Math.PI;
      volume = area * length;
      

      
     System.out.printf("Area: %.2f%nVloume: %.2f%n", area, volume);
        
        sc.close();
    }
}
