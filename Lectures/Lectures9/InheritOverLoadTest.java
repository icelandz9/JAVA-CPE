import java.util.Scanner;

public class InheritOverLoadTest {
    public static void main(String[] args) {
        float rate;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total OT hour : ");
        int hour = scan.nextInt();
        Employee0 emp1 = new Employee0(hour); // สร้างemp1มารับค่าและเข้าถึง เมธอด Employee0
        System.out.println("\"Employee\"\nTotal OT Pay = (" + emp1.rate + " * " + hour + ") = " + emp1.pay + " BAHT");

        System.out.print("\"Daily Employee\"\nRate per Day = ");
        rate = scan.nextFloat();
        daily_emp emp2 = new daily_emp(hour, rate); // ค่าที่รับเข้ามาจะถูกส่งไปที่ เมธอต daily_emp
        System.out.println("Total OT Pay = (" + emp2.rate + " * " + hour + ") = " + emp2.pay + " BAHT");

        System.out.print("\"Monthly Employee\"\nEnter Salary = ");
        rate = scan.nextFloat();
        System.out.print("Enter Bonus = ");
        float bonus = scan.nextFloat();
        monthly_emp emp3 = new monthly_emp(hour, rate / 30, bonus); // ค่าที่รับเข้ามาจะถูกส่งไปที่ เมธอต monthly_emp
        System.out.println("Total OT Pay = (" + emp3.rate + " * " + hour + ") + " + bonus + " = " + emp3.pay + " BAHT");
    }
}