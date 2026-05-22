import java.util.*;
class loob1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    
    while(true){
      System.out.println("EnterNumber:");
      int num = input.nextInt();
      
      if(num == 0){
        break;
      }
      num1++;
      if(num > 0){
        num2++;
      }else if(num < 0){
        num3++;
      }
    } 
    double avr = (num1 == 0)?0: (double)num1/(num2 + num3);
    
    System.out.println("totalNumber:"+num1);
    System.out.println("positiveNumber:"+num2);
    System.out.println("negativeNumber:"+num3);
    System.out.println("averags:"+avr);
  }
}