class A
{
    private static A instance = null;

    public String s;

    private A()
    {
        s = "Hello I am a string...";
    }

    public static A getInstance()
    {
        if (instance == null)
            instance = new A();

        return instance;
    }
}

class Singleton
{
    public static void main(String args[])
    {
	A x = A.getInstance();
 	A y = A.getInstance();
 	A z = A.getInstance();

        x.s = (x.s).toUpperCase();

        System.out.println(x.s);
        System.out.println(y.s);
        System.out.println(z.s);
        System.out.println("\n");

        z.s = (z.s).toLowerCase();

        System.out.println(x.s);
        System.out.println(y.s);
        System.out.println(z.s);
    }
}
