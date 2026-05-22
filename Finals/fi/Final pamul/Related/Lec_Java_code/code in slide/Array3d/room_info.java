import java.util.Scanner;
public class room_info
{
  public int b,f,r,total_man=0,total_available=0;
  public int get_total(int[][][] rm,int t)
  {
    int count=0;
    for(int i=0;i<b;i++){
       for(int j=0;j<f;j++){
         for(int k=0;k<r;k++){
           switch(t){
           case 0 :
             if(rm[i][j][k]==0)
           {
             count++; 
           }
             break;
           case 1 :
             if(rm[i][j][k]!=0)
           {
             count+=rm[i][j][k];
           }
             break;
         }
       }
     }
  }
    return count;
  }
public int[][][] inputdata()
  {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter total buildings");
     b = input.nextInt();
     System.out.println("Enter total floors");
     f = input.nextInt();
     System.out.println("Enter total rooms");
     r = input.nextInt();
     int[][][] rm = new int[b][f][r];
     for(int i=0;i<b;i++){
       for(int j=0;j<f;j++){
         for(int k=0;k<r;k++){
           System.out.println("Enter total people live in building"+(i+1)+"floor"+(j+1)+"room"+(k+1)+":");
           int g = input.nextInt();
           rm[i][j][k] = g;
           //rm[i][j][k] = new Integer(g);
         }
       }
     }
   return rm;
  }
  public void cheakdata(int[][][] rm)
  {
    total_man = get_total(rm,1);
    total_available = get_total(rm,0); 
  }
  public void showdata()
  {
    System.out.println("Total people is : "+total_man);
    System.out.println("Available rooms is : "+total_available);
  }
}