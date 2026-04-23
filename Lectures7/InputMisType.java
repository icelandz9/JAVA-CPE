// package Lectures7;
import java.util.Scanner;

public class InputMisType {
    public static void main (String[] args){
        try {
        System.out.print ("Enter X: ");
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        System.out.print ("Enter Y: ");
        int Y = scan.nextInt();
        System.out.println (X / Y);
        }
        catch (ArithmeticException e1) { 
        System.out.println(e1+"\nหมายถึง \"ข้อผิดพลาด" + "ที่เกิดจากการหารด้วยศูนย์\"");
        }
        catch (Exception e2) {
        System.out.println (e2+"\nหมายถึง \"ข้อผิดพลาด" + "ที่เกิดจากการป้อนข้อมูลเข้าผิดประเภท\"");
        }
    }
}