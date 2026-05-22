/*
 * ชื่อไฟล์: LabeledLoops.java
 * หัวข้อ: การตั้งชื่อลูป (Labeled Loops) กับ break/continue
 * คำอธิบาย: แสดงวิธีใช้ Label เพื่อ break หรือ continue ลูปชั้นนอก
 *           จากภายในลูปชั้นใน (ใช้กับ Nested Loop)
 * ตัวอย่างการใช้งาน: ค้นหาข้อมูลในหลายชุด, สแกนไฟล์ในหลายเซิร์ฟเวอร์
 */

public class LabeledLoops {
    public static void main(String[] args) {

        // --- Use Case: ระบบค้นหาไวรัสใน Server ---
        // สมมติเรามี 3 Server (Server 1, 2, 3)
        // แต่ละ Server มีไฟล์ 5 ไฟล์
        // เป้าหมาย: ถ้าเจอไวรัสปุ๊บ ให้สั่ง "ปิดระบบค้นหาทั้งหมดทันที" (Emergency Stop)

        System.out.println("=== Labeled Break ===");
        System.out.println("--- Start Virus Scan ---");

        // ตั้งชื่อลูปใหญ่ว่า "ServerScanner"
        ServerScanner: for (int serverId = 1; serverId <= 3; serverId++) {

            System.out.println("Scanning Server #" + serverId + "...");

            for (int fileId = 1; fileId <= 5; fileId++) {

                // สมมติว่าไฟล์ที่ 3 ใน Server 2 เป็นไวรัส
                if (serverId == 2 && fileId == 3) {
                    System.out.println("   [!] ALERT: Virus Found at Server " + serverId + " File " + fileId);
                    System.out.println("   >>> ABORTING ALL SCANS IMMEDIATELY! (Break ServerScanner)");

                    // สั่งหยุดการค้นหา "ทั้งหมด" (กระโดดข้ามลูป serverId ออกไปเลย)
                    break ServerScanner;
                }

                System.out.println("   - File " + fileId + " is clean.");
            }

            // ถ้าใช้ break ธรรมดา โค้ดตรงนี้จะยังทำงานต่อ
            // แต่พอใช้ break ServerScanner มันจะข้ามตรงนี้ไปเลย
            System.out.println("Server #" + serverId + " scan complete. (Clean)");
        }

        System.out.println("--- Scan Process Terminated ---");

        // --- ตัวอย่าง Labeled Continue ---
        System.out.println("\n=== Labeled Continue ===");
        outer: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue outer; // ข้ามไปรอบถัดไปของลูป outer (ไม่ใช่ลูป j)
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === Labeled Break ===
 * --- Start Virus Scan ---
 * Scanning Server #1...
 *    - File 1 is clean.
 *    ...
 * Server #1 scan complete. (Clean)
 * Scanning Server #2...
 *    - File 1 is clean.
 *    - File 2 is clean.
 *    [!] ALERT: Virus Found at Server 2 File 3
 *    >>> ABORTING ALL SCANS IMMEDIATELY!
 * --- Scan Process Terminated ---
 * === Labeled Continue ===
 * i=1, j=1
 * i=2, j=1
 * i=3, j=1
 *
 * หมายเหตุ:
 * - break ธรรมดา หยุดเฉพาะลูปที่อยู่ชั้นในสุด
 * - break <label> หยุดลูปที่มีชื่อตรงกับ label (ข้ามออกไปทุกชั้น)
 * - continue <label> ข้ามไปรอบถัดไปของลูปชั้นที่กำหนด
 */
