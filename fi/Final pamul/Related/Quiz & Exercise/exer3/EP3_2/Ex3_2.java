public class Ex3_2 {
  public static void main(String[]args){
    double kilo1 = 1,mile1 = 1,kilo2 = 20,mile2;
    System.out.println("Miles       Kilometers   |   Kilomerers       Miles");
      for(int i=0;i<10;i++){ //loop kilo to miles
        for(int j=0;j<1;j++){  //loop miles to kilo
        kilo1 = mile1 * 1.609;
        if (kilo1<10){
        System.out.print(mile1+"         "+kilo1+"        |   ");
          mile1++;}
        else if(mile1>=10){
        System.out.print(mile1+"        "+kilo1+"        |   ");
          mile1++;}
        else{
         System.out.print(mile1+"         "+kilo1+"       |   ");
         mile1++;}
        }
      mile2 = kilo2 * 0.621;
      System.out.print(kilo2+"             "+mile2+"\n");
      kilo2 +=5;
     }
   }
}