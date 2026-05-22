class Type_Casting {
    public static void main(String[] args) {
        // แปลงชนิดตัวแปร

        // แปลงจากเล็กไปใหญ่
        int numInt = 10;
        double numdouble = numInt;
        System.out.println(numInt);
        System.out.println(numdouble);

        System.out.println("//////////////////////////");

        // แปลงจากใหญ่ไปเล็ก ต้องกำหนดtypeให้มัน
        double numDouble = 20.9;
        int numInt2 = (int)numDouble;
        System.out.println(numInt2); //ปัดทศนิยมลง
        System.out.println(numDouble);
    }
}
