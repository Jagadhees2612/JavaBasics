class Z5
{
	static int i=test();

	static
	{
		System.out.println("SIB1:"+i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main:"+i);
	}
	static
	{
		System.out.println("SIB2");
	}
	static int test()
	{
		System.out.println("from test:"+i);
		return 100;
	}
	static
	{
		System.out.println("SIB3");
	}
}
