public class ExceptionExample{
        public static void main(String args[]){
		String s="abc";
                try{
			//int i=Integer.parseInt(s);
			int data=100/0;
                }catch(ArithmeticException e){
                        System.out.println(e);
                }catch(Exception e){
                        System.out.println(e);
                }finally {
                	System.out.println("rest of the code...");
                }
        }
}
