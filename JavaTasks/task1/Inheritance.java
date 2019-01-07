class Dog
{
	void eat(){
		System.out.println("Eating...");
	}
}
class BullDog extends Dog
{
	void bark(){
		System.out.println("Barking...");
	}
}
class MaleBullDog extends BullDog
{
	void sleep(){
		System.out.println("Sleeping...");
	}
}
class Pug extends Dog
{
	void eat(){
                System.out.println("Not Eating...");
        }
	void bark(){
		System.out.println("Barking...");
	}
}
class Boxer extends Dog
{
	void sleep(){
                System.out.println("Sleeping...");
        }
}
class Inheritance
{
    public static void main(String[] args)
     {
/*
	System.out.println("Single:");
	Pug dog1=new Pug();
	dog1.eat();

	System.out.println("Multilevel:");
	MaleBullDog dog2=new MaleBullDog();
	dog2.eat();
	dog2.bark();
	dog2.sleep();

	System.out.println("Hierarchical:");
	Boxer dog3=new Boxer();
	dog3.eat();
	dog3.sleep();
*/

/*
	Dog d=new Dog();
	d.eat();
*/	Dog d1=new Pug();
	d1.eat();
    //d1.bark(); Inheritance Error can't find bark() cz d1 z of type Dog
/*
	Pug p=new Pug();
	p.eat();
	p.bark();
	//Pug p1=new Dog();//Inheritance Error dog can't b converted into pug

	Dog d2=p;
	d2.eat();
	//d2.bark();//can't find
	Pug p2= (Pug) d2;
	p2.eat();
	p2.bark();
*/


     }
}
