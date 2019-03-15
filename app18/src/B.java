class B 
{
	void test ()
	{
		System.out.println("test");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}

/*
o/p:
B.java:11: error: non-static method test() cannot be referenced from a static context
                test();
                ^
1 error
*/