import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args)
    {
        double  celsius;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Celsius value: ");
        celsius=in.nextDouble();

        Double fahrenheit;
        fahrenheit =1.8*celsius+32;

        System.out.println(celsius +" Celsius = "+ fahrenheit +" Fahrenheit");

        int kelvin;
        kelvin= (int) (celsius+273);
        System.out.println(celsius +" Celsius = "+kelvin + " Kelvin");



    }

}
