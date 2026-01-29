import java.util.Scanner;
class Input{
    public static void main(String[] args) {

        // รับค่าจากแป้นพิมพ์
        Scanner sc = new Scanner(System.in);

        System.out.print("Input ur Name 1: ");
        String name = sc.nextLine(); //nextLine คือรับค่า String จากแป้นพิมพ์
        System.out.print("Input ur Name 2: ");
        String name2 = sc.next(); //next จำไม่อ่านช่องว่างถ้าหลังจากจะอ่านแค่คำแรก

        System.out.println("ur Name 1 is: " + name);
        System.out.println("ur Name 2 is: " + name2);
    }
}