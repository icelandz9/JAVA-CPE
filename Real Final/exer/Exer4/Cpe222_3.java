import java.util.Scanner;
public class Cpe222_3{
  public static void main(String args[]){
    System.out.printf("%s\t%s","i","m(i)\n");
    System.out.println("___________");
    for(int i=1;i<=1000;i+=100){ //????????
      System.out.printf("%d\t%.4f\n",i,m(i));
    }
  }
  public static double m(int i){
    double pi=0;
    double sign=1;
    for(int k=1; k<=i ;k++){
      pi+=sign/(2*k-1.0);
      sign=-1*sign;
    }
    return 4*pi;
  }
}