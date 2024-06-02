public class FactorialCalculation {
    public static void main(String[] args)
    {
        int number=8;

        int i=1;

        while(i<=number)
        {
            if(number%i==0)
            {
                System.out.print(i +",");
            }
            i++;
        }
    }
}
