import java.util.Scanner;
public class quiz2_2{
  public static void main(String[] args){
  Scanner sn = new Scanner(System.in);
  System.out.println("Enter your guess number [1-3]: ");
  int X = sn.nextInt();
  int RD = (int)(Math.random() * 90+45);
  if (RD > 90){
    RD-=45;
  }
  System.out.println("Random Number is "+RD);
  int K;
  boolean a1 = (RD%5==0)? true:false;
  boolean a2 = (RD%3==0)? true:false;
  boolean a3 = (RD%4==0)? true:false;
  
  if (a1 || a2) {
    K = 2;
    if (a3) {
      K = 3;
    }
  } else {
    K = 1;
  }
  
  System.out.println("Scoer of Random number is = "+K+". Your number is = "+X);
  if (X == K) {
    System.out.println("Congratulations! You conrrect");
      
  } else{
    System.out.println("Sorry,you wrong");
    }
  sn.close();
}
}


























//  m1 = (a1 == true)? K+=2:k+=1;
//  m2 = (a2 == true)? K+=2:k+=1;
//  m3 = (a3 == true)? K+=3:k+=1;