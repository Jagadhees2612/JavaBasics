class A 
{
	void test()
	{
		System.out.println("superclass-test");
	}
}
class U extends A
{
	public void test()
	{
		System.out.println("subclass-test");//while ovrrid  a mtd same access level or wider..for def u can go for 
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

//private < default < protected < public

//O/P: helloworld!