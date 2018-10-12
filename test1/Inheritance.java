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
     }
}
