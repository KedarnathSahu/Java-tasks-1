class MyClass
{
    public static void main(String[] args)
     {
       Sop.display1().display2();
     }
}
class Sop{
	public static Sop display1(){
		 System.out.println("1");
		return new Sop();
	}
	public static void display2(){
		 System.out.println("2");
	}
}
