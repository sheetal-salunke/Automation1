public class ReverseNumber {
    public static void main(String[] args)
    {
        int a=346;
        int remainder;
        int reverse=0;
    while (a!=0)
        {
            remainder=a%10;
            reverse=reverse*10+remainder;
            a=a/10;
        }

        System.out.println("Reverse is "+ reverse);
    }
}
