public class SecondsToHMSConversion {
    public static void main(String[] args)
    {
        int inputseconds=86399;

        int hours=inputseconds/3600;
        int minutes=(inputseconds%3600)/60;
       int seconds=inputseconds%60;
        System.out.println(hours+" hours "+minutes+" minutes "+seconds +" seconds");
    }
}
