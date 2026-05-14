import java.util.Scanner ;
public class q22 {
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    System.out.println("Enter a year : ");
    int x = sn.nextInt();
    
    int y = x%12 ;
    int z = x%4 ;
    
    switch(y){
      case 0 : if(z == 0){
        System.out.print(x+" is a leap year. The Chinese zodiac of "+x+"is monkey");
      }
      else {
        System.out.print(x+" is not a leap year. The Chinese zodiac "+x+" is monkey");
      }
      break ;
      
      case 1 : if(z == 0){
        System.out.print(x+" is a leap year. The Chinese zodiac of "+x+"is roster");
      }
      else {
        System.out.print(x+" is not a leap year. The Chinese zodiac "+x+ " is roster");
      }
      break ;
      
      case 2 : if(z == 0){
        System.out.print(x+" is a leap year. The Chinese zodiac of "+x+"is dog");
      }
      else {
        System.out.print(x+" is not a leap year. The Chinese zodiac "+x+ " is dog");
      }
      break ;
      
      case 3 :  if(z == 0){
        System.out.print(x+" is a leap year. The Chinese zodiac of "+x+"is pig");
      }
      else {
        System.out.print(x+" is not a leap year. The Chinese zodiac "+x+ " is pig");
      }
      break ;
      
      case 4 : if(z == 0){
        System.out.print(x+" is a leap year. The Chinese zodiac of "+x+"is rat");
      }
      else{
        System.out.print(x+" is not a leap year. The Chinese zodiac "+x+ " is rat");
      }
      break ;
      
      case 5 :  if(z == 0){
        System.out.print(x+" is a leap year. The Chinese zodiac of "+x+"is ox");
      }
      else {
        System.out.print(x+" is not a leap year. The Chinese zodiac "+x+ " is ox");
      }
      break ;
      
      case 6 :  if(z == 0){
        System.out.print(x+" is a leap year. The Chinese zodiac of "+x+"is tiger");
      }
      else {
        System.out.print(x+" is not a leap year. The Chinese zodiac "+x+ " is tiger");
      }
      break ;
      
      case 7 :  if(z == 0){
        System.out.print(x+" is a leap year. The Chinese zodiac of "+x+"is rabbit");
      }
      else {
        System.out.print(x+" is not a leap year. The Chinese zodiac "+x+ " is rabbit");
      }
      break ;
      
      case 8 :  if(z == 0){
        System.out.print(x+" is a leap year. The Chinese zodiac of "+x+"is dragon");
      }
      else {
        System.out.print(x+" is not a leap year. The Chinese zodiac "+x+ " is dragon");
      }
      break ;
      
      case 9 : if(z == 0){
        System.out.print(x+" is a leap year. The Chinese zodiac of "+x+"is snake");
      }
      else {
        System.out.print(x+" is not a leap year. The Chinese zodiac "+x+ " is snake");
      }
      break ;
      
      case 10 :  if(z == 0){
        System.out.print(x+" is a leap year. The Chinese zodiac of "+x+"is sheep");
      }
      else {
        System.out.print(x+" is not a leap year. The Chinese zodiac "+x+"is horse");
      }
      break ;
      
      case 11 :  if(z == 0){
        System.out.print(x+" is a leap year. The Chinese zodiac of "+x+"is sheep");
      }
      else {
        System.out.print(x+" is not a leap year. The Chinese zodiac "+x+ " is sheep");
      }
      break ;
    }
  }
}