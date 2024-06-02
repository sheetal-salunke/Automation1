import java.util.Scanner;

public class FindNumberOfDaysInMonth {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Month number from 1 to 12");
        int number=input.nextInt();
        int days=0;
        switch(number){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                    days=31;
                    break;
            case 2:
                days=28;
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                days=30;
            break;
            default:break;
        }

        System.out.println("Number of days "+days + " in month "+ number);
    }
}
