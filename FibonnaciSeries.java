import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args)
    {
        int i=0,j=1, temp, number;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to print Fibonnaci Series till entered number: ");
        number=sc.nextInt();

        System.out.print(i+ " "+j+ " ");
        for(int count=2;count<=number;count++)
        {
            temp=i+j;
            System.out.print(temp+ " ");
            i=j;
            j=temp;

        }
    }
}
