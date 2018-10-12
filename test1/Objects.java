import java.lang.reflect.*;

class Objects implements Cloneable
{
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    String name="Cumulations Tech.";
    
    Objects(){
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public static void main(String[] args)
    {	
    //1.new keyword
        Objects obj = new Objects();
        System.out.println(obj.name);
	//2.newInstance
	try
        {
		Class cls = Class.forName("Objects");
        	obj = (Objects) cls.newInstance();
        	System.out.println(obj.name);
        }
        catch (ClassNotFoundException e)
        {
		e.printStackTrace();
        }
        catch (InstantiationException e)
        {
		e.printStackTrace();
        }
	catch (IllegalAccessException e)
        {
        	e.printStackTrace();
        }
	//3.clone
        try
        {
            Objects obj1 = (Objects) obj.clone();
            System.out.println(obj1.name);
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
	//4.deserialization
	//5.newInstance of Constructor class
	try
        {
            Constructor<Objects> constructor = Objects.class.getDeclaredConstructor();
            Objects o = constructor.newInstance();
            o.setName("Cumulations Tech.");
            System.out.println(o.name);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
