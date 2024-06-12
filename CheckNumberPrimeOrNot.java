import java.util.Scanner;

public class CheckNumberPrimeOrNot {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        input = sc.nextInt();

        int count = 0;
        if (input == 0 || input == 1) {
            System.out.println(input + " is not prime number");
        } else {
            for (int i = 2; i <= input
                    / 2; i++) {

                if (input % i == 0) {

                    System.out.print(input + " is not a prime number");
                    count = 1;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(input + " is a prime number");
            }

        }
    }
}
