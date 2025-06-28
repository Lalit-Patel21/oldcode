
class A
{
	
	public A(int i)
	{
	this();	 
	
	 
	  System.out.println("Single Param Constructor of A called...");
	}
	public A(int i,int j)
	{
	this(i);	
	System.out.println("Double Param Constructor of A called...");
	}
	public A()
	{
	  System.out.println("Non Param Constructor of A called...");
	}
}
class B extends A
{
	public B()
	{
	        
		this();
		System.out.println("Constructor of B called...");
		
	}
}


class UseB
{
	public static void main(String [] args)
	{
		B obj=new B();
	}
}