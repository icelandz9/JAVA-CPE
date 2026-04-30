import java.util.Scanner;
public class Exercise3_01 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter an integer, the input ends if it is 0: ");
    int positives=0, negatives=0, total=0;
    while(true) {
      int integer = sn.nextInt();
      if (integer == 0) {
        break;
      } else if (integer > 0) {
        positives += 1;
      } else {
        negatives += 1;
      }
      total += integer;
    }
    double average = (double)total/(positives+negatives);
    
    System.out.println("The number of positives is: "+positives);
    System.out.println("The number of negatives is: "+negatives);
    System.out.println("The total is: "+total);
    System.out.print("The average is: "+average);
    sn.close();
  }
} 