/*
 * ชื่อไฟล์: Array3D.java
 * หัวข้อ: อาร์เรย์ 3 มิติ (3D Arrays)
 * คำอธิบาย: การเก็บข้อมูลแบบ "ชั้น" x "แถว" x "คอลัมน์"
 *           เปรียบเสมือนหนังสือหลายๆ เล่ม, หรือตึกที่มีหลายชั้น
 * ตัวอย่างการใช้งาน: int[layer][row][col], ข้อมูล Pixel RGB, ข้อมูลเกม 3D voxel
 */

public class Array3D {
    public static void main(String[] args) {
        System.out.println("=== อาร์เรย์ 3 มิติ ===");

        // สร้างอาร์เรย์ 3 มิติ ขนาด 2 ชั้น, ชั้นละ 3 แถว, แถวละ 2 คอลัมน์
        // int[z][y][x] หรือ [layer][row][col]
        int[][][] data = {
                // ชั้นที่ 0 (Layer 0)
                {
                        { 10, 20 }, // row 0
                        { 30, 40 }, // row 1
                        { 50, 60 } // row 2
                },
                // ชั้นที่ 1 (Layer 1)
                {
                        { 100, 200 },
                        { 300, 400 },
                        { 500, 600 }
                }
        };

        // การเข้าถึงข้อมูล
        System.out.println("ค่าที่ Layer 1, Row 2, Col 0: " + data[1][2][0]); // 500

        System.out.println("\n-- แสดงข้อมูลทั้งหมด --");

        for (int layer = 0; layer < data.length; layer++) {
            System.out.println("Layer " + layer + ":");
            for (int row = 0; row < data[layer].length; row++) {
                for (int col = 0; col < data[layer][row].length; col++) {
                    System.out.print(data[layer][row][col] + "\t");
                }
                System.out.println(); // จบแถว
            }
            System.out.println(); // จบชั้น
        }
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === อาร์เรย์ 3 มิติ ===
 * ค่าที่ Layer 1, Row 2, Col 0: 500
 * 
 * -- แสดงข้อมูลทั้งหมด --
 * Layer 0:
 * 10 20
 * 30 40
 * 50 60
 * 
 * Layer 1:
 * 100 200
 * 300 400
 * 500 600
 * 
 * หมายเหตุ:
 * - ในทางปฏิบัติเราไม่ค่อยใช้อาร์เรย์เกิน 3 มิติ เพราะจัดการยากและซับซ้อน
 * - มักใช้ Class/Object มาช่วยจัดการโครงสร้างข้อมูลที่ซับซ้อนแทน
 */
