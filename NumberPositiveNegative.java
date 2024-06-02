import java.util.Scanner;

public class NumberPositiveNegative {
    public static  void main(String[] args)
    {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the number: ");
int number=input.nextInt();
if(number>0)
{
    System.out.println("Number is Positive ");
}
else {
    System.out.println("Number is Negative");
}
    }
}
