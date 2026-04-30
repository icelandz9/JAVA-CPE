import java.util.Scanner;

public class Q7_3 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    String Message = sn.nextLine();

    int Ar[] = countStrAr(Message);

    System.out.println("Number of A "+Ar[0]);
    System.out.println("Number of E "+Ar[1]);
    System.out.println("Number of I "+Ar[2]);
    System.out.println("Number of O "+Ar[3]);
    System.out.println("Number of U "+Ar[4]);
    sn.close();
  }
  public static int[] countStrAr(String str) {
    int[] Ar = new int[5];
    for (int i=0;i<str.length();i++) {
      if (str.charAt(i) == 'A' || str.charAt(i) == 'a') {
        Ar[0] += 1;
      } else if (str.charAt(i) == 'E' || str.charAt(i) == 'e') {
        Ar[1] += 1;
      } else if (str.charAt(i) == 'I' || str.charAt(i) == 'i') {
        Ar[2] += 1;
      } else if (str.charAt(i) == 'O' || str.charAt(i) == 'o') {
        Ar[3] += 1;
      } else if (str.charAt(i) == 'U' || str.charAt(i) == 'u') {
        Ar[4] += 1;
      }
    }
    return Ar;
  }  
}