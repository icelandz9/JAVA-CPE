    import java.util.Scanner;

    public class LoopEx1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int num;
            int positive = 0;
            int negative = 0;
            int total = 0;
            int sum = 0;

            while (true) {
                System.out.print("Enter Your Number : ");
                num = sc.nextInt();

                if (num == 0) {
                    break;
                } 
                
                if (num > 0) {
                    positive++;
                }else {
                    negative++;
                }

                sum += num;
                total++;

                if (total == 0) {
                    System.out.println("No numbers are entered except 0");
                } else {
                    double average = (double) sum / total;
                    System.out.println("The number of positives is " + positive);
                    System.out.println("The number of negatives is " + negative);
                    System.out.println("The total is " + total);
                    System.out.println("The average is " + average);
                }
            }
            sc.close();
        }
    }
