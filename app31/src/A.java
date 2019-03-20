class A 
{
	void test()
	{
		System.out.println("test()");//meohsdy similar  ver
	}
	void test (int i)
	{
		System.out.println("test(int)");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test();
		System.out.println("---------");
		a1.test(20);
		System.out.println("---------");
	}
}

/*
o/p:
test()
---------
test(int)
---------
*/
