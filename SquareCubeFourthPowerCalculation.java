import java.util.Scanner;

public class SquareCubeFourthPowerCalculation {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number: ");
        double number=in.nextDouble();
        System.out.println("Square: "+number*number);
        System.out.println("Cube: "+number*number*number);
        System.out.println("Fourth Power: "+ Math.pow(number,4));
    }
}
