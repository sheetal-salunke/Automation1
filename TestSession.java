public class TestSession {
    public static void main(String[] args)
    {
        byte b1=(byte) 130;
        byte b2=(byte)(short)130;
        byte b3=(byte)(int)(short)130;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        int In=1234_23;
        System.out.println(In);

        int i=020;
        System.out.println("i value is "+i);

        int j=0X20;
        System.out.println("j value is "+j);

        byte t1=(byte) 10;
        System.out.println(t1);
    }
}
