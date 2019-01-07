interface A{
	int a=0;
	int b=9;
	void add();
}
class B implements A{
	public void add (){
	 System.out.println("Print"+a);
	}
}
public class TestI{
public static void main(String[] args){
	A a = new B();
	a.add();
	System.out.println(a.a);
}
}
