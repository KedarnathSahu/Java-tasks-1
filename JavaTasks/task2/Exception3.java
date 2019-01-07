import java.lang.NullPointerException;

class Exception3{

	public static void main(String[] args) {

		Exception3 t = initT();
		if(t==null){
			System.out.println("Null");
			}else{
			t.foo("Hi");
		}
	}

	private static Exception3 initT() {
		return null;
	}

	public void foo(String s) {
		System.out.println(s.toLowerCase());
	}
}
