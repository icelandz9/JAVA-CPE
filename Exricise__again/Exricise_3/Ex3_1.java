import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalnumber = 0;
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int sum = 0;
        
        System.out.print("Enter an integer, the input ends if it is 0: ");

        while (true){
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            totalnumber++;
            sum += num;
            if(sum > 0){
                positiveNumbers++;
            }else{
                negativeNumbers++;
            }
        }

        if (totalnumber == 0) {
            System.out.println("No numbers entered except 0");
        }else{
            double ave = (double) sum / totalnumber;
            System.out.println("The number of positives is: " + positiveNumbers);
            System.out.println("The number of negatives is: " + negativeNumbers);
            System.out.println("The total is: " + sum);
            System.out.println("The average is: " + ave);
        }

    }
}
