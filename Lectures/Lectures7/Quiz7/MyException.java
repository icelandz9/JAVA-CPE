import java.util.InputMismatchException;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int y1 = 20;
            int [] array = new int[23]; //กำหนด array ไม่เกิน 23 ช่อง
            System.out.println("Program for computing the equation of a straight-line resulst.");
            System.out.print("Enter C value: ");
            int c = sc.nextInt();
            System.out.print("Enter m value: ");
            int m = sc.nextInt();
            System.out.print("Enter the total number of Y: ");
            int total = sc.nextInt();
            sc.close();

            for(int i = 0; i < total; i++){
                array[i] = (y1 - c) / m;
                System.out.print(Math.ceil(array[i]) + " ");
                y1 += 1;
            }
        }catch(ArithmeticException e1){
            System.out.println("Program has some problem with: " + e1);
        }catch(InputMismatchException e2){
            System.out.println("Program has some problem with: " + e2);
        }catch(Exception e3){
            System.out.println("Program has some problem with: " + e3);
        }
    }
}
