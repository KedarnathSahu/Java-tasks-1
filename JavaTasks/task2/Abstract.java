abstract class A{
	void demo(){
		System.out.println("A");
	}

	abstract void demo1();
}

class C extends A{
	void demo(){
		System.out.println("C");
	}

	void demo1(){
		System.out.println("C1");
	}

	void demo2(){
                System.out.println("C2");
        }
}

public class Abstract{
	public static void main(String[] args){
		A a=new C();
		C c=new C();

                a.demo();
                a.demo1();

                c.demo();
                c.demo1();
		c.demo2();
	}
}
