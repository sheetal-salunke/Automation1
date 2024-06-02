public class GreatestNumberAmongThree {
    public static void main(String[] args)
    {
        int first=10;
        int second=34;
        int third=12;

        if(first>second && first>third)
        {
            System.out.println("Greatest Number is: "+ first);
        }
        else if(second>first && second>third)
        {
            System.out.println("Greatest number is: "+ second);
        }
        else {
            System.out.println("Greates number is: "+third);
        }
    }
}
