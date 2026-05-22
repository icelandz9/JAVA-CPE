import java.util.Scanner;
public class Ex6
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); 
    double[][] x = new double[3][3];
    double[][] y = new double[3][3];
    System.out.println("Enter matrix1 : ");
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        x[i][j]=input.nextDouble();
      }
    }
    System.out.println("Enter matrix2 : ");
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        y[i][j]=input.nextDouble();
      }
    }
    System.out.println("The multiplication of the matrices is ");
    double[][] z = new double[3][3];
    z=multiplyMatrix(x,y);
    for(int i=0;i<3;i++)
    {
     for(int j=0;j<3;j++)
      {
       System.out.print(x[i][j]+" ");
      }
     System.out.print("\t\t");
     for(int j=0;j<3;j++)
      {
       System.out.print(y[i][j]+" ");
      }
     System.out.print("\t");
     for(int j=0;j<3;j++)
     {
        System.out.print(z[i][j]+" ");
     }
     System.out.print("\t");
     System.out.print("\n");
    }
  }
  public static double[][] multiplyMatrix(double[][] a,double[][] b)
  {
    double[][] c = new double[3][3];
   for (int i=0; i<3;i++) 
   {
    for (int j=0;j<3;j++) 
    {
      for(int k=0;k<3;k++)
      {
        c[i][j]+=(a[i][k]*b[k][j]);
      }
    }
   }
    return c;
  }
}