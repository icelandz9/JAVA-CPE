import java.util.Scanner ;
public class q32 {
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    int i ;
    float sum=0,sum2=0 ;
    
    System.out.println("Please enter value of m : ");
    int m = sn.nextInt();
    System.out.println("Please enter value of n : ");
    int n = sn.nextInt();
    i = m ;
    
    for(int r=m ; r<=n ; r++){  
      sum += (float)(i/(i+1)) ;
      sum2 += (float)(2*i-1);
      i++ ;
    }
    
    float result = sum+sum2 ;
    System.out.println("The result of this summation : "+result);
      
  }
}