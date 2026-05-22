/*
 * ชื่อไฟล์: Array2D.java
 * หัวข้อ: อาร์เรย์ 2 มิติ (2D Arrays)
 * คำอธิบาย: การเก็บข้อมูลในรูปแบบตาราง (แถว x คอลัมน์)
 *           เหมาะสมกับการเก็บข้อมูลเมทริกซ์, ตารางเดินรถ, ที่นั่งในโรงหนัง
 * ตัวอย่างการใช้งาน: int[row][col]
 */

public class Array2D {
    public static void main(String[] args) {
        System.out.println("=== อาร์เรย์ 2 มิติ (Table) ===");

        // 1. ประกาศและสร้างอาร์เรย์ (2 แถว, 3 คอลัมน์)
        int[][] matrix = new int[2][3];

        // กำหนดค่า
        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[0][2] = 30;
        matrix[1][0] = 40;
        matrix[1][1] = 50;
        matrix[1][2] = 60;

        // 2. ประกาศและกำหนดค่าทันที
        String[][] students = {
                { "101", "Somchai" },
                { "102", "Somsri" },
                { "103", "SomYing" }
        };

        // 3. การแสดงผลด้วย Nested Loops
        System.out.println("-- แสดงผล Matrix 2x3 --");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t"); // \t คือ Tab
            }
            System.out.println(); // ขึ้นบรรทัดใหม่เมื่อจบแถว
        }

        System.out.println("\n-- แสดงรายชื่อนักเรียน --");
        for (String[] row : students) { // For-Each Loop (ได้แถวออกมา)
            System.out.println("รหัส: " + row[0] + " | ชื่อ: " + row[1]);
        }

        // Jagged Array (อาร์เรย์ที่แต่ละแถวมีคอลัมน์ไม่เท่ากัน)
        System.out.println("\n-- Jagged Array --");
        int[][] jagged = new int[3][];
        jagged[0] = new int[] { 1, 2 };
        jagged[1] = new int[] { 3, 4, 5, 6 };
        jagged[2] = new int[] { 7 };

        for (int[] row : jagged) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === อาร์เรย์ 2 มิติ (Table) ===
 * -- แสดงผล Matrix 2x3 --
 * 10 20 30
 * 40 50 60
 * 
 * -- แสดงรายชื่อนักเรียน --
 * รหัส: 101 | ชื่อ: Somchai
 * รหัส: 102 | ชื่อ: Somsri
 * รหัส: 103 | ชื่อ: SomYing
 * 
 * -- Jagged Array --
 * 1 2
 * 3 4 5 6
 * 7
 * 
 * หมายเหตุ:
 * - อาร์เรย์ 2 มิติ คือ "อาร์เรย์ของอาร์เรย์"
 * - matrix.length คือจำนวนแถว
 * - matrix[i].length คือจำนวนคอลัมน์ในแถวนั้นๆ
 */
