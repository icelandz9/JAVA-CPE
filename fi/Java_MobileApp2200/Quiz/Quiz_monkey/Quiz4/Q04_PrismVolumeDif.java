package Quiz.Quiz_monkey.Quiz4;

import java.util.Scanner;

/**
 * Quiz 4 - Item 2: Triangle Prism Volume Difference
 * คำนวณหาผลต่างของปริมาตรปริซึมสามเหลี่ยม 2 แท่ง ที่มีพื้นที่ฐาน(สามเหลี่ยม)เท่ากัน
 * โดยสร้างเมธอด tringlePrismVolumeDif(...)
 */
public class Q04_PrismVolumeDif {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        // 1. รับค่าต่างๆ ของปริซึมสามเหลี่ยม
        System.out.println("Enter value of triangle base:");
        double base = sn.nextDouble();
        
        System.out.println("Enter value of triangle height:");
        double height = sn.nextDouble();
        
        System.out.println("Enter inner length (shorter prism):");
        double innerLength = sn.nextDouble();
        
        System.out.println("Enter outer length (longer prism):");
        double outerLength = sn.nextDouble();
        
        // 2. เรียกใช้ Method เพื่อหาผลต่างของปริมาตร
        double diff = tringlePrismVolumeDif(base, height, outerLength, innerLength);
        
        System.out.println("The different volume of 2 Triangle Prisms is: " + diff);
        sn.close();
    }

    /**
     * Method คำนวณหาผลต่างของปริมาตรปริซึมสามเหลี่ยม 2 แท่ง ที่มีพื้นที่ฐานเท่ากัน
     * (Volume = 1/2 * base * height * length)
     */
    public static double tringlePrismVolumeDif(double base, double height, double outerLength, double innerLength) {
        // หาพื้นที่ฐานของสามเหลี่ยม
        double baseArea = 0.5 * base * height;
        
        // หาผลต่างความยาวก่อน แล้วจึงนำไปคูณกับพื้นที่ฐาน (วิธีนี้ลดการคูณซ้ำซ้อน)
        double lengthDiff = outerLength - innerLength;
        
        return baseArea * lengthDiff;
    }
}
