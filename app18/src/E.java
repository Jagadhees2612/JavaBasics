class E
{
	void test1()
	{
		System.out.println("test1()");
	}
	static void test2()
	{
		test1();
	}
}

/*
o/p:
E.java:9: error: non-static method test1() cannot be referenced from a static c
ntext
                test1();
                ^
1 error
*/