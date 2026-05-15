import java.util.Scanner ;
public class excer35 {
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    float sum=0,sum2 = 0 ;
    
    System.out.println("Enter num stu : ");
    int num = sn.nextInt();
    
    for(int n=1 ; n<=num ; n++){
    System.out.println("Enter score Stu "+n+": ");
    float x = sn.nextFloat() ;
    sum += x ;
    sum2 += Math.pow(x,2);
    }
    double mean = (double)sum/num ;
    double ss = (sum2-(num*mean*mean))/num;
    double sd = Math.sqrt(ss);
    System.out.println("mean= "+mean);
    System.out.println("SD = "+sd);
  }
}

    

   

  