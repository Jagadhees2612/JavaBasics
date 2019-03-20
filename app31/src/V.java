class A 
{
	protected void test()
	{
		System.out.println("superclass-test");
	}
}
class V extends A
{
	public void test()//public is a wider ..u can go for same access in wider..
	{
		System.out.println("subclass-test");
	}

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

//private < default < protected < public

//O/P: done