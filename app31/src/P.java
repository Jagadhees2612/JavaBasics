class A
{
} 
class B extends A
{
}
class C extends B//even c is a "co varient" A
{
}
class O
{
	A test()
	{
		return null;
	}
}
class P extends O
{
	B test() //co-varient(introduced in jdk 1.5)
	{
		return null;
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

//O/P: done