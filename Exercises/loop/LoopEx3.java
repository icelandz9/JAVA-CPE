public class LoopEx3 {
    public static void main(String[] args) {

        int row = 9;
        int num = 1;

        for (int i = 1; i <= row; i++) {

            // เว้นช่องว่างด้านซ้าย
            for (int j = 1; j <= row - i; j++) {
                System.out.print("   ");
            }

            // พิมพ์ตัวเลขในแถว
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.printf("%3d", num);
                num++;
            }

            System.out.println(); // ขึ้นบรรทัดใหม่
        }
    }
}
