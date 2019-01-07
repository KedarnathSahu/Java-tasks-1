interface Person{
      void eat();
}

abstract class Abc implements Person{
	abstract void walk();
}

class AnonymousClass{
	public static void main(String args[]){
  		Person p=new Person(){
		public void eat(){System.out.println("nice fruits");}
		};
		p.eat();

		Abc a=new Abc(){
		void walk(){System.out.println("Walking");}
		public void eat(){System.out.println("nice fruits");}
		};
		a.walk();
		a.eat();

		Person pr=()->{System.out.println("L1");System.out.println("L2");};
		pr.eat();
	}
}
