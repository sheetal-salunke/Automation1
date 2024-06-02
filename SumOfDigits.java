public class SumOfDigits {
    public static void main(String[] args)
    {
        int a=234;
        int digit=0,sum=0;

        while(a>0)
        {
           digit=a%10;
           sum=sum+digit;
           a=a/10;
        }

        System.out.println("Sum of number is "+sum);
    }
}
