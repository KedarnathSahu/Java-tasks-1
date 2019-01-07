class B{
	void add(){
		System.out.println("B");
	}
}

class A extends B{
	void add(){
		System.out.println("A");
	}
}

public class Overriding {
	public static void main(String[] args){
		B b=new B();
		A a=new A();
		b.add();
		a.add();
        Read flag;
        if (flag == 0) {
    		b=a;
        }
		b.add();
	}
}
