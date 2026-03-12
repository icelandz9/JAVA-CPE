public class Ex1 {
    public static void main(String[] args) {

        double celsius, fahrenheit,  cel = 0, far = 0;
        System.out.println("Celsius\t\tFahrenheit\t | \tFahrenheit\t\tCelsius");
        celsius = 40.0;
        fahrenheit = 120.0;

        for(int i = 0 ; i < 10 ;i++){
            cel = celsiusToFahrenheit(celsius);
            far = fahrenheitToCelsius(fahrenheit);

            System.out.printf("%.2f\t\t%.2f\t\t | \t%.2f \t\t\t %.2f \n", celsius, fahrenheit, cel, far);
            celsius -= 1;
            fahrenheit-= 1;
        }


    }

    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0/9) * (fahrenheit - 32);
    }
}
