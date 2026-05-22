import java.util.Scanner;

public class hour {
    public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      int num, sec, min, hr;
      
      System.out.print("Input Seconds: ");
      num = kb.nextInt();
      
      hr = num / 3600;
      min = (num % 3600) / 60;
      sec = num % 60;
      
      
      System.out.println(num + " Seconde is " + hr + " hours " + min + " minutes and " + sec + " seconds ");
      
      kb.close();
    }
}

      