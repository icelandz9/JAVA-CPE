import java.util.Scanner;

public class Q7_1 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    String Message = sn.nextLine();
    int binary = BinarytoDecimal(Message);
    System.out.print(binary);
    sn.close();
  }
  public static int BinarytoDecimal(String binaryString) {
    int N=0,Sum=0;
    for (int i=0;i<binaryString.length();i++) {
      if (binaryString.charAt(i) == '1') {
        N = (int)Math.pow(2, (binaryString.length() - 1) - i);
        System.out.println(N);
        Sum += N;
      } 
    }
    return Sum;
  }  
}