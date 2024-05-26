import java.util.Scanner;

public class MinutesToYearsAndDays {
    public static void main(String[] args)
    {
      try {
          Scanner input = new Scanner(System.in);
          System.out.println("Enter the minutes: ");

          long minutes = input.nextLong();
          long years = (long) (minutes / (60 * 24 * 365));
           long days=(long)(minutes/60/24)%365;
         // long days = minutes / 1440;

          System.out.println(minutes + " minutes is " + years + " years , " + days + " days.");
      }
      catch (Exception e)
      {
          System.out.println("Invalid Output");
      }


    }

}
