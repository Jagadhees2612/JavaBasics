class A 
{
	static int i;
	static
	{
		System.out.println(i);//direct read ,using a value of i
		i = 10;//direct write,assigning value of i
		test();
	}

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