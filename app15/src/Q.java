class Q
{
	static int i;

	public static void test() 
	{
		System.out.println("test:"+i);
	}

	public static void main(String[] args) 
	{
		System.out.println("main:"+i);
		test();
	}
}

/*
o/p:
main:0
test:0
*/