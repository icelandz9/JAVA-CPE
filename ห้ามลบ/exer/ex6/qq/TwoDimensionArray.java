public class TwoDimensionArray {
    public static void main(String[] args) {
        final int ROW = 3, COLUMN = 4;
        int score[][] = new int[ROW][COLUMN];
        int data = 5;

        // Assigning values
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                score[i][j] = data;
                data += 5;
            }
        }

        // Printing array
        System.out.println("Array");
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                System.out.print("\t" + score[i][j]);
            }
            System.out.println();
        }

        // Printing array's transpose
        System.out.println("Transpose array");
        for (int i = 0; i < COLUMN; i++) {
            for (int j = 0; j < ROW; j++) {
                System.out.print("\t" + score[j][i]);
            }
            System.out.println();
        }

        // Find a summation and an average
        int sum = 0;
        for (int i = 0; i < COLUMN; i++) {
            for (int j = 0; j < ROW; j++) {
                sum += score[j][i];
            }
        }
        System.out.println("Array's sum = " + sum);
        System.out.println("Array's avg = " + (float)(sum) / (ROW * COLUMN));

    }
}