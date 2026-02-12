class Variable {
    public static void main(String[] args) {
        // Parameter
        // int number1;
        float num2;
        String ch;

        final int NUM1 = 20; // final คือค่าคงที่ไม่สามารถเปลี่ยนค่าได้
        // NUM1 = 400;

        int num1 = 10;
        num2 = 32.32f;
        ch = "ice";

        System.out.printf("%d %.2f", num1, num2);
        System.out.println("\n" + num1 + " " + num2);
        System.out.println(NUM1);
        System.out.print("Name: "+ ch);


    }
} 