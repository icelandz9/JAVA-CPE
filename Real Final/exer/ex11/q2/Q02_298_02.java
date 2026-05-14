import java.util.Scanner;
public class Q02_298_02{
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Please enter guess score(1-3): ");
    int num = sn.nextInt();
    double rd = (Math.random())*75+1;
    double rn = Math.round(rd);
    int ans = (int)(rn);
    int x1 = ans%10 ;
    int x2 = ans%3 ; 

    if(x1==2 || x1==8){
      if(num == 2){
        System.out.println("Random number is "+ans+" => lucky number = 2");
        System.out.println("The lucky is 2 Your lucky number is 2. You correct");
      }
      else if(num != 2){
        System.out.println("Random number is "+ans+" => lucky number = 2");
        System.out.println("The lucky is 2 Your lucky number is "+num+" Sorry you wrong"); 
      }
    }

    else if(x2 == 0){
      if(num == 3){
        System.out.println("Random number is "+ans+" => lucky number = 3");
        System.out.println("The lucky is 3 Your lucky number is 3. You correct");
    }
      else if(num != 6){
        System.out.println("Random number is "+ans+" => lucky number = 3");
        System.out.println("The lucky is 3 Your lucky number is "+num+" Sorry you wrong"); 
      }
    }

      else if(num == 1){
        System.out.println("Random number is "+ans+" => lucky number = 1");
        System.out.println("The lucky is 1 Your lucky number is "+num+" You correct"); 
      }
      else if (num != 1){
      System.out.println("Random number is "+ans+" => lucky number = 1");
      System.out.println("The lucky is 1 Your lucky number is "+num+" Sorry you wrong"); 
      }
    }
}