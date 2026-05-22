public class Milestokilo {
  public static void main(String[] args) { 
    int i;
    int mile = 1, kilo = 20;
    double kilos, miles;
    System.out.println("Miles\t\tKilometers\t|  Kilometers\t\tMiles");
    for(i=0;i<=9;i++)
    {
      kilos = mile/0.621;
      miles = kilo*0.621;
      System.out.printf("%d\t\t%.3f\t\t|  %d\t\t\t%.3f\n",mile,kilos,kilo,miles);
      mile = mile+1;
      kilo = kilo+5;
    }
  }
}