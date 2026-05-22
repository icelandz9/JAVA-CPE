public class cpe222_442_02 {
  public static void main(String[] args) {
    double celsius, fahrenheit, cel = 0, fah = 0;
    int i;
    System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\t\tCelsius");
    System.out.println("---------------------------------------------------------------------");
    celsius = 40.0;
    fahrenheit = 120.0;
    for (i = 1; i <= 10; i++) {
      cel = celsiusToFahrenheit(celsius);
      fah = fahrenheitToCelsius(fahrenheit);
      System.out.printf("%.1f\t\t%.1f\t\t|\t%.1f\t\t\t%f\n", celsius, cel, fahrenheit, fah);
      celsius = celsius - 1;
      fahrenheit = fahrenheit - 10;
    }
  }

  public static double celsiusToFahrenheit(double celsius) {
    return (9.0 / 5) * celsius + 32;
  }

  public static double fahrenheitToCelsius(double fahrenheit) {
    return (5.0 / 9) * (fahrenheit - 32);
  }
}