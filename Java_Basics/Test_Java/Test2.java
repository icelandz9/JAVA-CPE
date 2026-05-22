public class Test2 {
    public static void main(String[] args) {

        int row = 8;

        // 🔺 สามเหลี่ยมขวา
        System.out.println("Triangle Right");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 🔺 สามเหลี่ยมซ้าย
        System.out.println("\nTriangle Left");
        for (int a = 1; a <= row; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 🔺 พีระมิดตรงกลาง
        System.out.println("\nTriangle Middle");
        for (int x = 1; x <= row; x++) {
            for (int y = 1; y <= row - x; y++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (2 * x - 1); z++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 🔻 พีระมิดกลับหัว
        System.out.println("\nTriangle Upside Down");
        for (int r = row; r >= 1; r--) {
            for (int t = 1; t <= row - r; t++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (2 * r - 1); l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ♦ Diamond
        System.out.println("\nDiamond");

        // บน
        for (int f = 1; f <= row; f++) {
            for (int h = 1; h <= row - f; h++) {
                System.out.print(" ");
            }
            for (int s = 1; s <= (2 * f - 1); s++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ล่าง
        for (int b = row - 1; b >= 1; b--) {
            for (int n = 1; n <= row - b; n++) {
                System.out.print(" ");
            }
            for (int p = 1; p <= (2 * b - 1); p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
