class A
{
} 
class B extends A
{
}
class C extends B//even c is a "co varient" A
{
}
class Q
{
	B test()
	{
		return null;
	}
}
class R extends Q
{
	B test() //u can use c also
	{
		return null;
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

//O/P: done