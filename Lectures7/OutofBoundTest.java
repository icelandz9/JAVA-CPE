public class OutofBoundTest {
    public static void main(String[] args) {
        int s[] = new int[2];
        try {
            for (int i = 0; i < 3; i++) {
                s[i] = i;
                System.out.println(s[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // ดักจับ error ที่เกิดจากการเข้า index เกินขอบเขต
            System.out.println("Program has some problem with " + e);
        }
        System.out.println("End");
    }
}