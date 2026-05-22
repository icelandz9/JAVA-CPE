public class ThrowsExceptionTest2 {
    public static void main(String[] args) {
        ThrowsExceptionTest2 t = new ThrowsExceptionTest2();
        try {
            t.method1(6, 3);
            t.method1(6, 0);
            t.method1(6, 2.5);
        } catch (ArithmeticException exception) {
            System.out.println("Divide by zero not allowed ");
        }
    }

    public void method1(double num1, double num2) throws ArithmeticException {
        System.out.println(method2(num1, num2));
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

// Output
// 6.0/3.0 = 2.0
// 6.0/0.0 ===> 
// Divide by zero not allowed 

// ถ้าอยากให้ t.method1(6, 2.5); ออกมาต้องให้ method1 มี try-catch