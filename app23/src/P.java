class A 
{
	static
	{
		System.out.println("A-SIB1");
	}
	static
		{
		System.out.println("A-SIB2");//whwnever p is loading into the memory a is not loading into the mem..
		}
}
class P
{
	static
	{
		System.out.println("A-SIB1");
	}
	static
	{
		System.out.println("A-SIB2");
	}
}
class P
{
	static
	{
		System.out.println("P-SIB1");
	}
	static
	{
		System.out.println("P-SIB2");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
