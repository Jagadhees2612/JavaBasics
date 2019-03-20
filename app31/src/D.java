class D 
{
	private int test()
	{
		System.out.println("test()");//there is no condition liuke all are 
		return 100;
	}
	protected static void test(int i)
	{
		System.out.println("test(int)");
	}
	public static void main(String[] args) 
	{
		D obj = new D();
		obj.test();
		System.out.println("-------");
		D.test(20);
		System.out.println("-----");
	}
} 


/*
O/P:
test()
-------
test(int)
-----
*/