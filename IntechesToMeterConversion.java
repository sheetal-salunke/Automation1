import java.util.Scanner;

public class IntechesToMeterConversion {
    public static void main(String[] args)
    {
        double intches;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter intches: ");
        intches=in.nextDouble();

        double meter;
        meter=intches*0.0254;

        System.out.println(intches +" intches= "+meter+ " meter");
    }
}
