class Variabel_2 {
    public static void main(String[] args) {
        // Global Varible
        int a = 100;
        int b = 200;
        System.out.println(a);

        {
            // Local Varible
            int c = 300;
            System.out.println(c);
            System.out.println("Num A = "+ a);
        }
        System.out.println(b);

        // ดูค่าตัวแปรว่าเก็บได้เท่าไหร่
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }

}