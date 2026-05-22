import java.util.Scanner ;
import java.util.Random ;
import java.util.Arrays;
public class excer62 {
  public static void main(String[] args){

    Random rd = new Random();
    Scanner sn = new Scanner(System.in);

    //int numin[] = {7,4,3,9} ;
    int[] freq = new int[4];


    System.out.println("Enter num array size : ");
    int arraysize = sn.nextInt();

    int[] array = new int[arraysize];
    int[] numin = new int[4];

    for(int n=0 ;n<=3;n++){
    System.out.println("your number "+(n+1)+" : ");
    numin[n] = sn.nextInt();
    }

    System.out.println("Your array : ");
    System.out.print("{ ");

    for(int n=0 ; n<=arraysize-1 ; n++){
      int r = rd.nextInt(10);
      array[n] = r ;
      System.out.print(""+array[n]+" ");
    }
    System.out.println("}");

    int f = 0 ;
    for(int i=0;i<=3;i++){
      f = 0 ;
      for(int j=0;j<=arraysize-1;j++){
        if(numin[i]==array[j]){
          f += 1 ;
        }
        freq[i] = f ;
      }
      System.out.print(f+" ");
    }

    System.out.println("");
    Arrays.sort(freq);
    System.out.println("max freq = "+freq[3]);
    }
  }