public class Forloop {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i <= 5; i++) {
            System.err.println("Forloop I = " + i);
            if (i == 5) {
                while (true) {
                    if (count == 5) {
                        System.out.println("Nested Loop = "+ count);
                        break;
                    }
                    count++;
                }
            }
        }
    }
}
