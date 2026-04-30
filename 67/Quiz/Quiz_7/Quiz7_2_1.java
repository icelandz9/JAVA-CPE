import java.util.Scanner;

public class Quiz7_2_1 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    String Message = sn.nextLine();
    
    int TY = countTY(Message);
    
    System.out.println("Number of T & Y in this message : "+TY);
    sn.close();
  }
  
  public static int countTY(String str) {
    str= str.toLowerCase();
    int TY=0;
    for (int i=0;i<str.length()-1;i++) {
      if (str.charAt(i) == 't' && str.charAt(i+1) == 'y') {
            TY += 1;
          }
        }
      
    
    return TY;
  }  
}