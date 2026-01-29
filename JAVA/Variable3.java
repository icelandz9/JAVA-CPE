class Variable3{
    public static void main(String[] args) {
        
        char ch = 'A';
        String a = "100", b = "200";
        int c;
        // String => int
        c = Integer.parseInt(a);
        c = c + 50;

        // String => Double
        double d = Double.parseDouble(b);
        d = d + 32.1;

        // int => String
        int num1 = 20;
        String age = String.valueOf(num1);


        System.out.println(ch);
        System.out.println("int a: "+ a);
        System.out.println("String => int: "+ c);
        System.out.println("String => double: "+ d);
        System.out.println("int => String: " + age);

        // เช็คชนิดช้อมูล
        Integer x = 10;
        float y;
        double z;
        String w = "Hello";
        char chr;
        boolean l;

        boolean result = x instanceof Integer;
        System.out.println(result);
    }
}