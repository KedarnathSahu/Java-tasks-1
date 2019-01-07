class Overloading
{
    public static void main(String[] args)
     {
	float a=add(2,3f);
	float b=add(4.7f,7.9f);
	System.out.println(a+"\n"+b);


	DisplayOverloading obj= new DisplayOverloading();
	obj.add(2,3.5f);
	obj.add('g',4.67);
	obj.add(4.8f,5,6.8f);

   }

     static double add(int a,double b){
	return (a+b);
     }
     static float add(int a,float b){
	return (a+b);
     }
     static float add(float a,float b){
     	return (a+b);
     }
}

class DisplayOverloading
{
    static Overloading obj2= new Overloading();

    public void add(int a,double b)
    {
         System.out.println(obj2.add(a,b));//static polymorphism
    }

    public void add(float a,int b,float c)
    {
	float sum=a+b+c;
         System.out.println(sum);
    }

}
