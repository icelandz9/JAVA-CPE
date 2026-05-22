import java.util.Scanner;
public class Ex3_1 {
  public static void main(String[]args){
    int pnum = 0,nnum = 0,total = 0;
    int input;
    float a = 0;
    float average;
    Scanner x = new Scanner(System.in);
    System.out.println("Enter an integer, the input ends if it is 0: ");
    do{
      input = x.nextInt();
      if(input>0){
        pnum++;
      }
      else if(input<0){
        nnum++;
      }
      total++;
      a += input;
    } while (input !=0);
    average = a/(total-1);
    System.out.println("The number of positives is:"+pnum);
    System.out.println("The number of negatives is:"+nnum);
    System.out.println("The total is:"+total);
    System.out.println("The average is: "+average);
  }
}