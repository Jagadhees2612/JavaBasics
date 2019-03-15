class D 
{
	void test()
	{
		System.out.println("test()");
	}
	static
	{
		test();
	}
}

/*
o/p:
D.java:9: error: non-static method test() cannot be referenced from a static context
                test();
                ^
1 error
*/
