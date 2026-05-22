import java.util.Scanner;
public class Ex3
{ 
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Emter the number of seconds : ");
    int seconds = input.nextInt();
    int hour = seconds/3600;
    int miniute = (seconds-(hour*3600))/60;
    int sec = seconds -((hour*3600)+(miniute*60));
    if (sec<0){
      sec = 0;}
    System.out.println(seconds +" seconds " + hour + " hours " + miniute + " miniutes " +sec+ " seconds ");
  }
}  