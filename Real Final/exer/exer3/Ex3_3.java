public class Ex3_3{
  public static void main(String[]args){
    int x = 1,k = 1,row = 9,space = 9,value = 9;
    for(int i=0;i<row;i++){
      space = value;
        do {
          System.out.print("   ");
          space -= 1;
        } while (space >0);
        for(int j=0;j<k;j++){
          if (x<10){
          System.out.print(x+"  ");
          x++;
          }
          else if (x>=10){
          System.out.print(x+" ");
          x++;
          }
        }
      k +=2;
      value -= 1;
      System.out.print("\n");
    }
  }
}