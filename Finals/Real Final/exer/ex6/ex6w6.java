import java.util.Scanner;
public class ex6w6{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    int i, j;
    double[][] a = new double[3][3];
    double[][] b = new double[3][3];
    double[][] c = new double[3][3];
    System.out.print("Enter matrix1 : ");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        a[i][j] = sn.nextDouble();
      }
    }
    System.out.print("Enter matrix2 : ");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        b[i][j] = sn.nextDouble();
      }
    }
    c = multiplyMatrix(a, b);
    System.out.println("The multiplication of the mmatrices is");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        System.out.print(a[i][j]+" ");
      }
      if(i==1)
      {
        System.out.print("*");
      }
      else
      {
        System.out.print("\t");
      }
      for(j=0;j<3;j++)
      {
        if(j==0)
        {
          System.out.print(" ");
        }
        System.out.print(b[i][j]+" ");
      }
      if(i==1)
      {
        System.out.print("=");
      }
      else
      {
        System.out.print("\t");
      }
      for(j=0;j<3;j++)
      {
        if((i==0 && j==0) || (i==2 && j==0))
        {
          System.out.print(" ");
        }
        if(j==0)
        {
          System.out.print(" ");
        }
        System.out.print(c[i][j]+" ");
      }
      System.out.print("\n");
    }
    sn.close();
  }
  
  public static double[][] multiplyMatrix(double[][] a, double[][] b){
    double[][] cal = new double[3][3];
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        cal[i][j] = (a[i][0]*b[0][j]) + (a[i][1]*b[1][j]) + (a[i][2]*b[2][j]);
      }
    }
    return cal;
  }
}