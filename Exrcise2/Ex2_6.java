import java.util.Scanner;
public class Ex2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = sc.nextInt();
        year %= 12;

        String ch_zoo;

        switch(year){
            case 0 :
                ch_zoo = "monkey";
                break;
            case 1 : 
                ch_zoo = "rooster";
                break;
            case 2 :
                ch_zoo = "dog";
                break;
            case 3 :
                ch_zoo = "pig";
                break;
            case 4 :
                ch_zoo = "rat";
                break;
            case 5 : 
                ch_zoo = "ox";
                break;
            case 6 : 
                ch_zoo = "tiger";
                break;
            case 7 : 
                ch_zoo = "rabbit";
                break;
            case 8 : 
                ch_zoo = "dragon";
                break;
            case 9 : 
                ch_zoo = "snake";
                break;
            case 10:
                ch_zoo = "horse";
                break;
            case 11:
                ch_zoo = "sheep";
                break;
        default:
                ch_zoo = "Not (chinese zodiac)";
            break;
        }
        System.out.println(ch_zoo);
        sc.close();
    }
}
