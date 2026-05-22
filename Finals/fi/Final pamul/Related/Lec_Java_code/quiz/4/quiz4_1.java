import java.util.Scanner;
public class quiz4_1
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
   System.out.print("Enter all value of hexagonal prism 1 and hexagonal prism 1 : ");
   int b1 = input.nextInt();
   int h1 = input.nextInt();
   int a1 = input.nextInt();
   int b2 = input.nextInt();
   int h2 = input.nextInt();
   int a2 = input.nextInt();
   double areadiff = hexagonalPrismSurfaceDif(b1,h1,a1,b2,h2,a2);
   System.out.println("The different surface area of 2 hexagonal prism is : "+areadiff);
  }
  public static double hexagonalPrismSurfaceDif(int baseEdge1,int height1,int apothem1,int baseEdge2,int height2,int apothem2)
  {
    double ar1=(6*(apothem1*baseEdge1))+(6*(baseEdge1*height1));
    double ar2=(6*(apothem2*baseEdge2))+(6*(baseEdge2*height2));
    System.out.println("The surface area of hexagonal prism 1 is : "+ar1);
    System.out.println("The surface area of hexagonal prism 2 is : "+ar2);
    return Math.abs(ar1-ar2);
  }
}