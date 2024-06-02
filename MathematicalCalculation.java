public class MathematicalCalculation {
    public static void main(String[] args)
    {
        int input1=10;
        int input2=6;

 int sum=input1 + input2;
 int diff=input1 - input2;
 int product=input1 * input2;
        double average=(double) (input1 + input2) / 2;
        System.out.println("Sum of two integers: "+sum );
        System.out.println("Difference of two integers: "+ diff);
        System.out.println("Product of two integers: "+ product);
        System.out.println("Average of two integers: "+average);
        int distance=Math.abs(input1 - input2);
        System.out.println("Distance of two integers: "+distance );

        if(input1>input2)
        {
            System.out.println("Max Number: "+input1);
        }
        else {
            System.out.println("Max Number: "+input2);
        }
        if(input1<input2)
        {
            System.out.println("Min Number: "+input1);
        }
        else {
            System.out.println("Min Number: "+input2);
        }

    }
}