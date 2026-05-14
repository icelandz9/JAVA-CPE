import java.util.Scanner ;
public class q41 {
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
     System.out.println("Enter width : ");
     int w = sn.nextInt();
     System.out.println("Enter lenght : ");
     int l = sn.nextInt();
     System.out.println("Enter inner depth : ");
     int id = sn.nextInt();
     System.out.println("Enter outer depth : ");
     int od = sn.nextInt();
     
     System.out.println("Different volume of 2 Rec box is : "+recdif.rectangleboxvolumedif(w,l,id,od));
     
  }
}

class recdif{
public static double rectangleboxvolumedif(double length,double width,double deptin,double deptout){
  double rec1 = width*length*deptout ;
  double rec2 = width*length*deptin ;
  double dif = rec1-rec2 ;
  return dif ;
}
}

  