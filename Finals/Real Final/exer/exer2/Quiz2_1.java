import java.util.Scanner;
public class Quiz2_1{
  public static void main(String args[]){
    Scanner y = new Scanner(System.in);
    System.out.print("Enter a year:");
    int a = y.nextInt();
    int b = a%12;
    int c = a%4;
    
   if (c==0)
   {
     System.out.print(a+  " is a leap year."); 
   }
  
   else if (c!=0)
   {
     System.out.print(a+  " is not a leap year.");
   }
    switch(b)
    {
    case 4: System.out.print("Your chinese zodiac is rat"); break;
    case 5: System.out.print("Your chinese zodiac is ox"); break;
    case 6: System.out.print("Your chinese zodiac is tiger"); break;
    case 7: System.out.print("Your chinese zodiac is rabbit"); break;
    case 8: System.out.print("Your chinese zodiac is dragon"); break;
    case 9: System.out.print("Your chinese zodiac is snake"); break;
    case 10: System.out.print("Your chinese zodiac is horse"); break;
    case 11: System.out.print("Your chinese zodiac is goat"); break;
    case 0: System.out.print("Your chinese zodiac is monkey"); break;
    case 1: System.out.print("Your chinese zodiac is rooster"); break;
    case 2: System.out.print("Your chinese zodiac is dog"); break;
    case 3: System.out.print("Your chinese zodiac is pig"); break;
    }
  }
}
    