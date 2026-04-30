import java.util.Scanner;
public class Q3_1{
  public static void main(String args[]){
    double T,Y,Tt= 0.00;
    int j=0,l=0;
    System.out.print("Enter the number of n : ");
    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();
    if(n%2 == 0 || n%7 == 0){
      for(int i = 1 ; i <= n ; i+=40){
        T = i/(i+2.0);
        Y = (2*i)+2;
        Tt += (T+Y); 
        System.out.println("T("+i+")T = "+Tt);
      }
    }else{
      System.out.println("Error");
    }
    sn.close();
  }
}

































//        T = ((Math.pow(1,i+1))/((2*i)-1))+(2*i);