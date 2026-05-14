import java.util.Scanner ;
public class q31 {
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    
    for(int r=6 ;r>=0 ;r--){
      int x=20;
      
      for(int rr=1; rr<=r ; rr++){
        System.out.print(""+x+" ");
        x++ ;
        
      }
      System.out.print("\n");
    }
  }
}