class C 
{
	private void test()
	{
		System.out.println("test()");//u can choose indepentently any access level..
	}
	protected static void test(int i)
	{
		System.out.println("test(int)");//1st mtd not at all depending on 2 nd mtd..bothn indepentent
	}
	public static void main(String[] args) 
	{
		C obj = new C();
		obj.test();
		System.out.println("-------");
		C.test(20);
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