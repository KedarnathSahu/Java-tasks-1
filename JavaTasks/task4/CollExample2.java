import java.util.*;

public class CollExample2{
	public static void main(String args[]){
    		LinkedList<String> n=new LinkedList<String>();
    		n.add("Ravi");
    		n.add("Vijay");
    		n.add("Ravi");
    		n.add("Ajay");

		System.out.println(n);

		Iterator<String> i=n.iterator();
    		while(i.hasNext()){
   			System.out.println(i.next());
    		}

		System.out.println(n);

		for(String v: n){
			System.out.println(v);
		}
    	}
}
