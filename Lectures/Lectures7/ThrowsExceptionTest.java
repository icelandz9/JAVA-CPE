public class ThrowsExceptionTest {
    public static void main(String[] args) {
        ThrowsExceptionTest t = new ThrowsExceptionTest();
        t.method1(6, 3);
        t.method1(6, 0);
        t.method1(6, 2.5);
    }

    public void method1(double num1, double num2) {
        System.out.println(method2(num1, num2));
    }

    public String method2(double a, double b) throws ArithmeticException { // ประกาศว่า method นี้ อาจโยน ArithmeticException ออกไป
        if (b == 0) {
            System.out.println(a + "/" + b + " ===> ");
            throw new ArithmeticException();
        } else {
            return a + "/" + b + " = " + (a / b);
        }
    }
}

// throws บอกว่า method อาจเกิด error เกิดที่ หัว method
// throw โยน error ออกไปจริงๆ เกิดในโค้ด
// try-catch จัดการ error ตรงนั้นเลย เกิดในโค้ด