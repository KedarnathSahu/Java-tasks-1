abstract class A{
void demo(){
System.out.println("A");
}
abstract void demo1();
}

class C extends A{
//void demo(){
//System.out.println("C");
//}
void demo1(){
System.out.println("C1");
}
}

public class Abstract{
public static void main(String[] args){
C c=new C();
c.demo();
c.demo1();
}
}
