class B 
{
	void test()
	{
		System.out.println("test()");
	}
	static void test(int i) //overloading mtd all cn be non ststic all can be static
		{
		System.out.println("test(int)");
		}

	public static void main(String[] args) 
	{
		B obj = new B();
		obj.test();
		System.out.println("---------");
		B.test(20);
		System.out.println("----------");
	}
}

/*
O/P:
test()
---------
test(int)
----------
*/