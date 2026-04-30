import java.util.Scanner;

public class Exercise6_06{
  public static void main(String[] args){
  Scanner sn = new Scanner(System.in);
  double[][] A;
  A = new double[3][3];
  double[][] B;
  B = new double[3][3];
  System.out.print("Enter matrix1: ");
  for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
    A[i][j] = sn.nextDouble();
    }
  }
  
  System.out.print("Enter matrix2: ");
  for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
    B[i][j] = sn.nextDouble();
    }
  }
  System.out.println("The multiplication of the matrices is");
    double result[][]= multiplyMatrix(A,B);
    for(int i=0;i<3;i++){
      if(i==1){
          System.out.println(A[i][0]+" "+A[i][1]+" "+A[i][2]+" * "+B[i][0]+" "+B[i][1]+" "+B[i][2]+" = "+result[i][0]+" "+result[i][1]+" "+result[i][2]);
      }
      else{
          System.out.println(A[i][0]+" "+A[i][1]+" "+A[i][2]+"   "+B[i][0]+" "+B[i][1]+" "+B[i][2]+"   "+result[i][0]+" "+result[i][1]+" "+result[i][2]);
      }
    }
    
    /*for(int i=0;i<3;i++){
      for(int j=0;i<3;i++){
          System.out.print(A[i][j]+" ");
      }
      System.out.println();
    }*/ 
    
    /*for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        //System.out.println(A[i][j]+"\t\t"+B[i][j]); 
        //System.out.print(A[i][j]+" ");
        //System.out.print("\t"+B[i][j]+" ");
        System.out.print(result[i][j]+" ");
        }
     System.out.println();  
    }*/

  }
  
  public static double[][] multiplyMatrix(double [][]A,double [][]B){
   double[][] C;
   C = new double[3][3];
   for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            C[i][j] = (A[i][0] * B[0][j]) + (A[i][1] * B[1][j]) + (A[i][2] * B[2][j]);
        }
   }
    
   return C;
  }
  
}