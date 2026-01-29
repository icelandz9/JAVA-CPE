public class Whileloop {
    public static void main(String[] args) {
        int count = 1, i = 0;
        while (count <= 10) {
            System.out.println(count + " Hello");
            count++;
            if (count == 8) {
                break;
            }
        }

        // Do while
        do {
            System.out.println("Do While = " + i);
            i++;
        } while (i <= 5);
    }
}