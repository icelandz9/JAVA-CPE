import java.util.Scanner;

public class QuizString01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        int result = countCPESWU(str);
        System.err.println("The number of CPESWU alphabets is " + result);
        scanner.close();
    }
    public static int countCPESWU(String str){
        int C = 0;
        int P = 0;
        int E = 0;
        int S = 0;
        int W = 0;
        int U = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i)=='C'||str.charAt(i)=='c') {
                C++;
            }
            if (str.charAt(i)=='P'||str.charAt(i)=='p') {
                P++;
            }
            if (str.charAt(i)=='E'||str.charAt(i)=='e') {
                E++;
            }
            if (str.charAt(i)=='S'||str.charAt(i)=='s') {
                S++;
            }
            if (str.charAt(i)=='W'||str.charAt(i)=='w') {
                W++;
            }
            if (str.charAt(i)=='U'||str.charAt(i)=='u') {
                U++;
            }
        }
        System.out.println("Total 'C' alphabets is " + C);
        System.out.println("Total 'P' alphabets is " + P);
        System.out.println("Total 'E' alphabets is " + E);
        System.out.println("Total 'S' alphabets is " + S);
        System.out.println("Total 'W' alphabets is " + W);
        System.out.println("Total 'U' alphabets is " + U);

        int result = C + P + E + S + W + U;
        return result;
    }
}
