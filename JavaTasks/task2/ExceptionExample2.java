import java.io.IOException;

class ExceptionExample2{
	void n() throws IOException{
		throw new IOException("Devise error2");
	}
	void p(){
		try{
			n();
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("Exception Handled: "+e.getMessage());
		}
	}
	public static void main(String[] args){
		ExceptionExample2 obj=new ExceptionExample2();
		obj.p();
	}
}
