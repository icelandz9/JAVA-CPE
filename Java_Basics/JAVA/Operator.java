import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = a - b;
        int x = a * b;
        int y = a / b;
        int z = a % b;

        System.out.println("sum+ =  " + (a + b)); //บวกในSystem
        System.out.println("sum+ =  " + c);
        System.out.println("sum- =  " + d);
        System.out.println("sum* =  " + x);
        System.out.println("sum/ =  " + y);
        System.out.println("sum% =  " + z);

        System.out.println("--------------------------------");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Input Num2 : ");
        int num2 = sc.nextInt();
        
        System.out.println("\nOutPut Num1 = " + num1);
        System.out.println("OutPut Num2 = " + num2);
        
        sc.close();
        
        System.out.println("--------------------------------");
        // Compare แสดงแค่ True / Falst
        System.out.println(num1 + " == " + num2 +" ? "+ (num1 == num2));
        System.out.println(num1 + " != " + num2 +" ? "+ (num1 != num2));
        System.out.println(num1 + " > " + num2 +" ? "+ (num1 > num2));
        System.out.println(num1 + " < " + num2 +" ? "+ (num1 < num2));
        System.out.println(num1 + " >= " + num2 +" ? "+ (num1 >= num2));
        System.out.println(num1 + " <= " + num2 +" ? "+ (num1 <= num2));

        System.out.println("--------------------------------");
        /* ตัวดำเนินการทางตรรกศาสตร์ => Logic 
        && and จริงคู่ถึงได้ จริง
        || or ตัวใดตัวนึงเป็นจริงจะจริงเลย
        ! not 
        */
       
       boolean sum1 = (num1 == num2);
       boolean sum2 = (num1 != num2);
       
       System.out.println("sum1 && sum2: "+ (sum1 && sum2));
       System.out.println("sum1 || sum2: "+ (sum1 || sum2));
       System.out.println("sum1 ! "+ (! sum1));
       
       System.out.println("--------------------------------");
       // Prefix Posfix ใช้ได้ทั้งบวกกับลบ
       
       // Prefix เพิ่มค่าแล้วนำไปใช้เลย 
       System.out.println("Prefix");
       int h = 10;
        System.out.println(h);
        System.out.println(++h);
        System.out.println(h);
        
        // Posfix ใช้ก่อนค่อยเพิ่มค่า
        System.out.println("\nPosfix");
        int j = 20;
        System.out.println(j);
        System.out.println(j++);
        System.out.println(j);
        
        System.out.println("--------------------------------");
        System.out.println("Compound");
        int A = 10;
        int B = 20;
        System.out.println("A = A + B: "+ (A += B));
        System.out.println("A = A - B: "+ (A -= B));
        System.out.println("A = A * B: "+ (A *= B));
        System.out.println("A = A / B: "+ (A /= B));
        System.out.println("A = A % B: "+ (A %= B));
    }
}