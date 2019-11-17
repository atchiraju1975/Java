public class InitDemo {

    static double double1;
    double double2;
    static int int1;
    int int2;
    static String string1;
    String string2;

    static
    {

        System.out.println("[class] double1 = " + double1);
        System.out.println("[class] int1 = " + int1);
        System.out.println("[class] string1 =" + string1);

    }


    {

        System.out.println("[class] double2 = " + double2);
        System.out.println("[class] int2 = " + int2);
        System.out.println("[class] string2 =" + string2);

    }

    static
    {
        double1 = 1.0;
        int1 = 10000000;
        string1 = "ABC";
    }


    {
        double2 = 1.0;
        int2 = 10000000;
        string2 = "ABC";
    }


    InitDemo()
    {

        System.out.println("InitDemo() called");
        System.out.println();

    }

    static double double3 = 10.0;
    double double4 = 10.0;

    static
    {
        System.out.println("[class] double3 =" + double3);
        System.out.println();
    }

    {
        System.out.println("[class] double4 =" + double4);
        System.out.println();
    }


    public static void main(String[] args)
        {

            System.out.println("main() started");
            System.out.println();
            System.out.println("[class] double1 = " + double1);
            System.out.println("[class] double3 = " + double3);
            System.out.println("[class] int1 = " + int1);
            System.out.println("[class] string1 = " + string1);
            System.out.println();

            for (int i = 0; i < 2; i++)

            {

                System.out.println("about to create init object");
                System.out.println();
                InitDemo id = new InitDemo();
                System.out.println("id created");
                System.out.println();

                System.out.println("[instance] id double2 = " + id.double2);
                System.out.println("[instance] id double4 = " + id.double4);
                System.out.println("[instance] id int2 = " + id.int2);
                System.out.println("[instance] id string2 = " + id.string2);
            }
    }

}
