import javax.swing.JOptionPane;
public class Q3_2{
  public static void main(String args[]){
    final int Row = 5;
    final int Col = 5;
    int Sum=0,RD=0;
    for (int n=1;n<=Row;n++) {
      for (int i=1;i<=Col;i++) {
        RD = (int)(Math.random() * 2499)-999;
        if (RD == 1500){
          RD-=1;
        }
        if (RD < 0) {
          Sum += RD;
        }
        if (RD >= 0 && RD<1000) {
          System.out.print(" ");
        }
        if (RD >= 0 && RD<100) {
          System.out.print(" ");
        }
        if (RD >= 0 && RD<10) {
          System.out.print(" ");
        }
        if (RD < 0 && RD>-100){
          System.out.print(" ");
        }
        System.out.print(RD+"\t");
      }
      System.out.println();
    }
    JOptionPane.showMessageDialog(null,"The sum of all negative numbers in the 5*5 matris is "+Sum);
  }
}
   