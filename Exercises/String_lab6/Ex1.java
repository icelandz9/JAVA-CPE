import java.util.Scanner;
import java.util.ArrayList;

public class Ex1 {

    String pcode;
    ArrayList<String> code = new ArrayList<>();

    public static void main(String[] args) {
        Ex1 obj = new Ex1();   // สร้าง object
        obj.inputdata();       // เรียก method
    }

    public void inputdata() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product code => ddmmyyyy0000MBreeze :");
        System.out.println("(Press x to Exit)");

        do {
            System.out.print("product code : ");
            pcode = scan.nextLine();

            if (!pcode.equals("x")) {
                code.add(pcode);
            }

        } while (!pcode.equals("x"));
    }
}