public class ThrowsExceptionTest1 {
    public static void main(String[] args) {
        ThrowsExceptionTest1 t1 = new ThrowsExceptionTest1();
        t1.method1(6, 3);
        t1.method1(6, 0);
        t1.method1(6, 2.5);
    }

    public void method1(double num1, double num2) {
        try {
            System.out.println(method2(num1, num2));
        } catch (ArithmeticException exception) {
            System.out.println("Divide by zero not allowed");
        }
    }

    public String method2(double a, double b) throws ArithmeticException {
        if (b == 0) {
            System.out.println(a + "/" + b + " ===> ");
            throw new ArithmeticException();
        } else {
            return a + "/" + b + " = " + (a / b);
        }
    }
}