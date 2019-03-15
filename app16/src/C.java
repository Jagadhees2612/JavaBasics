class C
{
	static
	{
		System.out.println(C.i);//indirect read
		i = 10;//direct write
		C.i = 10; //indirect write
		test();
	}

	static int i;// direct read is allowed before notifying jvm

	public static void test()
	{
		System.out.println(i); //indirect read
		i = 20; //indirect write
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}

/*
o/p:
0
10
20
*/